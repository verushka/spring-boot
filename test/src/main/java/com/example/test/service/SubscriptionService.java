package com.example.test.service;

import com.example.test.domain.Student;
import com.example.test.domain.Subscription;
import com.example.test.domain.Teacher;
import com.example.test.repository.StudentRepository;
import com.example.test.repository.SubscriptionRepository;
import com.example.test.repository.TeacherRepository;
import com.example.test.web.SubscriptionController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by nicaela on 16/6/2017.
 */
@Service
public class SubscriptionService {

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    public List<Subscription> getAllSubscription(){
        return subscriptionRepository.findAll();
    }

    public void addNewSubscription(SubscriptionController.SubscriptionRequestDTO subscriptionRequestDTO){
        Subscription subscription = new Subscription();

        Student student = studentRepository.findOne(subscriptionRequestDTO.getStudentId());
        Teacher teacher = teacherRepository.findOne(subscriptionRequestDTO.getTeacherId());

        subscription.setSubDate(subscriptionRequestDTO.getSubDate());
        subscription.setStudent(student);
        subscription.setTeacher(teacher);

        subscriptionRepository.save(subscription);
    }

}
