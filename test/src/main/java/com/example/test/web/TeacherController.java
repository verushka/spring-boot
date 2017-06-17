package com.example.test.web;

import com.example.test.domain.Teacher;
import com.example.test.service.TeacherService;
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
@RequestMapping("/teachers")
@Api(value="teachers", description="Operations pertaining to products in Online Store")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Teacher> getAllTeachers(){
        return teacherService.getAllTeachers();
    }
    @RequestMapping(method = RequestMethod.POST)
    public void addNewTeacher(@RequestBody TeacherRequestDTO teacher){
        teacherService.addNewTeacher(teacher);
    }


    public static class TeacherRequestDTO{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
