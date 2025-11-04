package com.example.roombooking.service;

public interface BookingService {
    Booking createBooking(Booking booking);
    Booking updateBooking(Long id, Booking booking);
    List<Booking> getAllBookings();
}
