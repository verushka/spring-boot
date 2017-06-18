package com.dh.exam.service;

import com.dh.exam.domain.Buyer;
import com.dh.exam.domain.Car;
import com.dh.exam.domain.RegistryCarSold;
import com.dh.exam.domain.Seller;
import com.dh.exam.repository.BuyerRepository;
import com.dh.exam.repository.CarRepository;
import com.dh.exam.repository.RegistryCarSoldRepository;
import com.dh.exam.repository.SellerRepository;
import com.dh.exam.web.RegistryCarSoldController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by nicaela on 17/6/2017.
 */
@Service
public class RegistryCarSoldService {
    @Autowired
    private RegistryCarSoldRepository registryCarSoldRepository;

    @Autowired
    private BuyerRepository buyerRepository;

    @Autowired
    private SellerRepository sellerRepository;

    @Autowired
    private CarRepository carRepository;


    public List<RegistryCarSold> getAllRegistry(){
        return registryCarSoldRepository.findAll();
    }

    public void addNewRegistryCardSold(RegistryCarSoldController.CarSoldRequestDTO carSoldRequestDTO){
        RegistryCarSold carSold = new RegistryCarSold();
        Buyer buyer = buyerRepository.findOne(carSoldRequestDTO.getBuyerId());
        Seller seller = sellerRepository.findOne(carSoldRequestDTO.getSellerId());
        Car car = carRepository.findOne(carSoldRequestDTO.getCarId());
        carSold.setSold_date(carSoldRequestDTO.getSold_date());
        carSold.setSeller(seller);
        carSold.setBuyer(buyer);
        carSold.setCar(car);

        registryCarSoldRepository.save(carSold);
        updateNumCarSold(seller);
    }

    public RegistryCarSold getRegistry(String id){
        return registryCarSoldRepository.findOne(id);
    }

    public HashMap<String, Object> getRegistriesBySeller(String id) {
        HashMap<String, Object> registries = new HashMap<String, Object>();
        RegistryCarSold registry = registryCarSoldRepository.findSellerById(id);

        if (null != registry) {
            registries.put("name", registry.getSeller().getName());
            registries.put("ci", registry.getSeller().getCi());
            registries.put("age", registry.getSeller().getAge());
            registries.put("CarsSoldNumber", registry.getSeller().getNumCarSold());
        }
        return registries;
    }

    public void deleteRegistry(String id){
        registryCarSoldRepository.delete(id);
    }



    public RegistryCarSold updateRegistry(String id, RegistryCarSoldController.CarSoldRequestDTO carSoldRequestDTO) {
        RegistryCarSold carSold = new RegistryCarSold();
        Buyer buyer = buyerRepository.findOne(carSoldRequestDTO.getBuyerId());
        Seller seller = sellerRepository.findOne(carSoldRequestDTO.getSellerId());
        Car car = carRepository.findOne(carSoldRequestDTO.getCarId());
        carSold.setId(id);

        carSold.setSold_date(carSoldRequestDTO.getSold_date());
        carSold.setBuyer(buyer);
        carSold.setSeller(seller);
        carSold.setCar(car);
        registryCarSoldRepository.save(carSold);
        return carSold;
    }

    private void updateNumCarSold(Seller seller){
        long numCarSold = seller.getNumCarSold();
        seller.setNumCarSold(numCarSold + 1);
        sellerRepository.save(seller);

    }

}
