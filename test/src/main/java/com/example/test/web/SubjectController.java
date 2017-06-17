package com.example.test.web;

import com.example.test.domain.Subject;
import com.example.test.service.SubjectService;
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
@RequestMapping("/subjects")
@Api(value="subjects", description="Operations pertaining to products in Online Store")
public class SubjectController {


    @Autowired
    private SubjectService subjectService;


    @RequestMapping(method = RequestMethod.GET)
    public List<Subject> getAllSubjects(){
        return subjectService.getAllSubjects();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addNewSubject(@RequestBody SubjectRequestDTO subjectDTO){
        subjectService.addNewSubjects(subjectDTO);
    }


    public static class SubjectRequestDTO{
        private String code;
        private String name;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
