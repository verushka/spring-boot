package com.dh.exam.repository;

import com.dh.exam.domain.Car;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by nicaela on 17/6/2017.
 */
public interface CarRepository extends MongoRepository<Car, String> {

}
