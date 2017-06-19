package com.dh.exam.web;

import com.dh.exam.domain.Buyer;
import com.dh.exam.domain.Car;
import com.dh.exam.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by nicaela on 17/6/2017.
 */
@RestController
@RequestMapping("/buyers")
public class BuyerController {
    @Autowired
    private BuyerService buyerService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Buyer> getAllCars(){
        return buyerService.getAllCars();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Buyer getBuyer(@PathVariable String id){
        return buyerService.getBuyer(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addNewBuyer(@RequestBody BuyerRequestDTO buyerRequestDTO){
        buyerService.addNewBuyer(buyerRequestDTO);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteBuyer(@PathVariable String id){
        buyerService.deleteBuyer(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Buyer updateBuyer(@PathVariable String id,@RequestBody BuyerRequestDTO buyerRequestDTO){
        return buyerService.updateBuyer(id, buyerRequestDTO);
    }


    public static class BuyerRequestDTO{
        private String name;
        private String ci;
        private String profession;
        private long cel;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCi() {
            return ci;
        }

        public void setCi(String ci) {
            this.ci = ci;
        }

        public String getProfession() {
            return profession;
        }

        public void setProfession(String profession) {
            this.profession = profession;
        }

        public long getCel() {
            return cel;
        }

        public void setCel(long cel) {
            this.cel = cel;
        }
    }
}
