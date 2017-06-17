package com.example.test.web;

import com.example.test.domain.Student;
import com.example.test.service.StudentService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by nicaela on 16/6/2017.
 */
@RestController
@RequestMapping("/students")
@Api(value="students", description="Operations pertaining to products in Online Store")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addNewStudent(@RequestBody StudentRequestDto studentRequestDto){
        studentService.addNewStudent(studentRequestDto);
    }


    public static class StudentRequestDto{

        private String name;
        private String ci;
        private String codSis;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCi() {
            return ci;
        }

        public void setCi(String ci) {
            this.ci = ci;
        }

        public String getCodSis() {
            return codSis;
        }

        public void setCodSis(String codSis) {
            this.codSis = codSis;
        }
    }

}
