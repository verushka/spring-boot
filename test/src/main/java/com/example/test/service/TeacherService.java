package com.example.test.service;

import com.example.test.domain.Teacher;
import com.example.test.repository.TeacherRepository;
import com.example.test.web.TeacherController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by nicaela on 16/6/2017.
 */
@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    public List<Teacher> getAllTeachers(){
        return teacherRepository.findAll();
    }

    public void addNewTeacher(TeacherController.TeacherRequestDTO teacherDTO){
        Teacher teacher = new Teacher();
        teacher.setName(teacherDTO.getName());
        teacherRepository.save(teacher);
    }
}
