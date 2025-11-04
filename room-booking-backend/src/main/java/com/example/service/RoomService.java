package com.example.service;

import com.example.entity.Room;
import com.example.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

   
    public Room saveRoom(Room room) {
        return roomRepository.save(room);
    }

    
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

 
    public Optional<Room> getRoomById(Long id) {
        return roomRepository.findById(id);
    }


    public Room updateRoom(Long id, Room updated) {
        return roomRepository.findById(id).map(existing -> {
            if (updated.getName() != null) existing.setName(updated.getName());
            if (updated.getPrice() != 0) existing.setPrice(updated.getPrice());
            existing.setAvailable(updated.isAvailable());
            return roomRepository.save(existing);
        }).orElseThrow(() -> new RuntimeException("Room not found"));
    }

   
    public void deleteRoom(Long id) {
        roomRepository.deleteById(id);
    }
}
