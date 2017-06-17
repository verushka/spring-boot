package com.example.test.service;

import com.example.test.domain.Student;
import com.example.test.repository.StudentRepository;
import com.example.test.web.StudentController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by nicaela on 16/6/2017.
 */
@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public void addNewStudent(StudentController.StudentRequestDto studentRequestDto){
        Student student = new Student();
        student.setName(studentRequestDto.getName());
        student.setCi(studentRequestDto.getCi());
        student.setCodSis(studentRequestDto.getCodSis());
        studentRepository.save(student);
    }
}
