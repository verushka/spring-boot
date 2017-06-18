package com.dh.exam.service;

import com.dh.exam.domain.Buyer;
import com.dh.exam.domain.Car;
import com.dh.exam.repository.BuyerRepository;
import com.dh.exam.web.BuyerController;
import com.dh.exam.web.CarController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by nicaela on 17/6/2017.
 */
@Service
public class BuyerService {
    @Autowired
    private BuyerRepository buyerRepository;

    public List<Buyer> getAllCars(){
        return buyerRepository.findAll();
    }

    public Buyer getBuyer(String id){
        return buyerRepository.findOne(id);
    }

    public void addNewBuyer(BuyerController.BuyerRequestDTO buyerRequestDTO){
        Buyer buyer = new Buyer();
        buyer.setName(buyerRequestDTO.getName());
        buyer.setCi(buyerRequestDTO.getCi());
        buyer.setProfession(buyerRequestDTO.getProfession());
        buyer.setCel(buyerRequestDTO.getCel());
        buyerRepository.save(buyer);
    }

    public void deleteBuyer(String id){
        buyerRepository.delete(id);
    }

    public Buyer updateBuyer(String id, BuyerController.BuyerRequestDTO buyerRequestDTO) {
        Buyer buyer = new Buyer();
        buyer.setId(id);

        buyer.setName(buyerRequestDTO.getName());
        buyer.setCi(buyerRequestDTO.getCi());
        buyer.setProfession(buyerRequestDTO.getProfession());
        buyer.setCel(buyerRequestDTO.getCel());
        buyerRepository.save(buyer);
        return buyer;
    }

}
