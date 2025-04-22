package com.example.courseregistration.model;

import jakarta.persistence.*;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String phoneNo;
    private String Name;
    private String Time;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    public String getTime() {
        return Time;
    }

    public void Time(String Time) {
        this.Time = Time;
    }


}
