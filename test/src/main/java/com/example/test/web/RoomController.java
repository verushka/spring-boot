package com.example.test.web;

import com.example.test.domain.Room;
import com.example.test.service.RoomService;
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
@RequestMapping("/rooms")
@Api(value="rooms", description="Operations pertaining to products in Online Store")
public class RoomController {
    @Autowired
    private RoomService roomService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Room> getAllRooms(){
        return roomService.getAllRooms();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addNewRoom(@RequestBody RoomRequestDTO roomRequestDTO){
        roomService.addNewRoom(roomRequestDTO);
    }


    public static class RoomRequestDTO{

        private String code;
        private int capacity;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }
    }
}
