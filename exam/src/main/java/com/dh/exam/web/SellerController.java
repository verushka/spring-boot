package com.dh.exam.web;

import com.dh.exam.domain.Buyer;
import com.dh.exam.domain.Seller;
import com.dh.exam.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by nicaela on 17/6/2017.
 */
@RestController
@RequestMapping("/sellers")
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Seller> getAllCars(){
        return sellerService.getAllSellers();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Seller getSeller(@PathVariable String id){
        return sellerService.getSeller(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addNewSeller(@RequestBody SellerRequestDTO sellerRequestDTO){
        sellerService.addNewSeller(sellerRequestDTO);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteSeller(@PathVariable String id){
        sellerService.deleteSeller(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Seller updateSeller(@PathVariable String id, SellerRequestDTO sellerRequestDTO){
        return sellerService.updateSeller(id, sellerRequestDTO);
    }

    public static class SellerRequestDTO{
        private String name;
        private long age;
        private String ci;
        private long numCarSold;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getAge() {
            return age;
        }

        public void setAge(long age) {
            this.age = age;
        }

        public String getCi() {
            return ci;
        }

        public void setCi(String ci) {
            this.ci = ci;
        }

        public long getNumCarSold() {
            return numCarSold;
        }

        public void setNumCarSold(long numCarSold) {
            this.numCarSold = numCarSold;
        }
    }

}
