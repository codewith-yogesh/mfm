package com.example.roombooking.service;

public interface RoomService {
    Room addRoom(Room room);
    List<Room> getAllRooms();
    Room updateRoom(Long id, Room room);
    void deleteRoom(Long id);
}
