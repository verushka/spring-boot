package com.dh.exam.repository;

import com.dh.exam.domain.RegistryCarSold;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 * Created by nicaela on 17/6/2017.
 */
public interface RegistryCarSoldRepository extends MongoRepository<RegistryCarSold, String>{
    @Query("{'seller.id' : ?0}")
    RegistryCarSold findSellerById(String id);

}
