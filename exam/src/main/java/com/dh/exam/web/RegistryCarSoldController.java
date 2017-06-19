package com.dh.exam.web;

import com.dh.exam.domain.RegistryCarSold;
import com.dh.exam.service.RegistryCarSoldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * Created by nicaela on 17/6/2017.
 */
@RestController
@RequestMapping("/cars sold")
public class RegistryCarSoldController {
    @Autowired
    private RegistryCarSoldService registryCarSoldService;

    @RequestMapping(method = RequestMethod.GET)
    public List<RegistryCarSold> getRegistry(){
        return registryCarSoldService.getAllRegistry();
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public RegistryCarSold getRegistry(@PathVariable String id){
        return registryCarSoldService.getRegistry(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addNewCarSold(@RequestBody CarSoldRequestDTO carSoldRequestDTO){
        registryCarSoldService.addNewRegistryCardSold(carSoldRequestDTO);
    }

    @RequestMapping(value = "/registriesCarsSoldBySeller/{sellerId}", method = RequestMethod.GET)
    public HashMap<String, Object> getRegistriesBySeller(@PathVariable String sellerId) {
        return registryCarSoldService.getRegistriesBySeller(sellerId);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteRegistry(@PathVariable String id){
        registryCarSoldService.deleteRegistry(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public RegistryCarSold updateRegistry(@PathVariable String id, @RequestBody CarSoldRequestDTO carSoldRequestDTO){
        return registryCarSoldService.updateRegistry(id, carSoldRequestDTO);
    }

    public static class CarSoldRequestDTO{
        private String sold_date;
        private String buyerId;
        private String sellerId;
        private String carId;

        public String getCarId() {
            return carId;
        }

        public void setCarId(String carId) {
            this.carId = carId;
        }

        public String getSold_date() {
            return sold_date;
        }

        public void setSold_date(String sold_date) {
            this.sold_date = sold_date;
        }

        public String getBuyerId() {
            return buyerId;
        }

        public void setBuyerId(String buyerId) {
            this.buyerId = buyerId;
        }

        public String getSellerId() {
            return sellerId;
        }

        public void setSellerId(String sellerId) {
            this.sellerId = sellerId;
        }
    }
}
