package com.example.test.repository;

import com.example.test.domain.Subscription;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by nicaela on 16/6/2017.
 */
public interface SubscriptionRepository extends MongoRepository<Subscription, String> {
}
