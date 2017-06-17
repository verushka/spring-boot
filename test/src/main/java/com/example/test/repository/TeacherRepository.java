package com.example.test.repository;

import com.example.test.domain.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by nicaela on 16/6/2017.
 */
public interface TeacherRepository extends MongoRepository<Teacher, String> {

}
