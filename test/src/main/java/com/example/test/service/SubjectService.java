package com.example.test.service;

import com.example.test.domain.Subject;
import com.example.test.repository.SubjectRepository;
import com.example.test.web.SubjectController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by nicaela on 16/6/2017.
 */
@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public List<Subject> getAllSubjects(){
        return subjectRepository.findAll();
    }

    public void addNewSubjects(SubjectController.SubjectRequestDTO subjectRequestDTO){
        Subject subject = new Subject();
        subject.setCode(subjectRequestDTO.getCode());
        subject.setName(subjectRequestDTO.getName());
        subjectRepository.save(subject);
    }
}
