package com.example.test.service;

import com.example.test.domain.Room;
import com.example.test.repository.RoomRepository;
import com.example.test.web.RoomController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by nicaela on 16/6/2017.
 */
@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    public List<Room> getAllRooms(){
        return roomRepository.findAll();
    }

    public void addNewRoom(RoomController.RoomRequestDTO roomRequestDTO){
        Room room = new Room();
        room.setCode(roomRequestDTO.getCode());
        room.setCapacity(roomRequestDTO.getCapacity());
        roomRepository.save(room);
    }
}
