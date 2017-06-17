package com.example.test.repository;

import com.example.test.domain.Room;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by nicaela on 16/6/2017.
 */
public interface RoomRepository extends MongoRepository<Room, String> {
}
