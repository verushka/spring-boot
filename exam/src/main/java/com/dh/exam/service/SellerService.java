package com.dh.exam.service;

import com.dh.exam.domain.Buyer;
import com.dh.exam.domain.Seller;
import com.dh.exam.repository.SellerRepository;
import com.dh.exam.web.BuyerController;
import com.dh.exam.web.SellerController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by nicaela on 17/6/2017.
 */
@Service
public class SellerService {
    @Autowired
    private SellerRepository sellerRepository;

    public List<Seller> getAllSellers(){
        return sellerRepository.findAll();
    }

    public Seller getSeller(String id){
        return sellerRepository.findOne(id);
    }

    public void addNewSeller(SellerController.SellerRequestDTO sellerRequestDTO){
        Seller seller = new Seller();
        seller.setName(sellerRequestDTO.getName());
        seller.setCi(sellerRequestDTO.getCi());
        seller.setAge(sellerRequestDTO.getAge());
        seller.setNumCarSold(sellerRequestDTO.getNumCarSold());

        sellerRepository.save(seller);

    }

    public void deleteSeller(String id){
        sellerRepository.delete(id);
    }

    public Seller updateSeller(String id, SellerController.SellerRequestDTO sellerRequestDTO) {
        Seller seller = new Seller();
        seller.setId(id);

        seller.setName(sellerRequestDTO.getName());
        seller.setCi(sellerRequestDTO.getCi());
        seller.setAge(sellerRequestDTO.getAge());
        seller.setNumCarSold(sellerRequestDTO.getNumCarSold());

        sellerRepository.save(seller);
        return seller;
    }

}
