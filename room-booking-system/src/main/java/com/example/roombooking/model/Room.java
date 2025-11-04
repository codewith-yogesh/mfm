package com.example.roombooking.model;

@Entity
@Table(name = "rooms")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String roomNumber;

    private String type;
    private double price;

    @Column(name = "availability_status")
    private boolean available;

    // getters and setters
}
