package com.example.test.web;

import com.example.test.domain.Subscription;
import com.example.test.service.SubscriptionService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Created by nicaela on 16/6/2017.
 */
@RestController
@RequestMapping("/subscriptions")
@Api(value="subscription", description="Operations pertaining to products in Online Store")
public class SubscriptionController {
    @Autowired
    private SubscriptionService subscriptionService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Subscription> getAllSubscriptions(){
        return subscriptionService.getAllSubscription();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addNewSubscription(@RequestBody SubscriptionRequestDTO subscriptionDTO){
        subscriptionService.addNewSubscription(subscriptionDTO);
    }

    public static class SubscriptionRequestDTO{

        private Date subDate;
        private String teacherId;
        private String studentId;

        public Date getSubDate() {
            return subDate;
        }

        public void setSubDate(Date subDate) {
            this.subDate = subDate;
        }

        public String getTeacherId() {
            return teacherId;
        }

        public void setTeacherId(String teacherId) {
            this.teacherId = teacherId;
        }

        public String getStudentId() {
            return studentId;
        }

        public void setStudentId(String studentId) {
            this.studentId = studentId;
        }
    }

}
