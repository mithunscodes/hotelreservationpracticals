package com.example.courseregistration.Controller;

import com.example.courseregistration.model.Reservation;
import com.example.courseregistration.Repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/courses")
@CrossOrigin(origins = "*")
public class ReservationController {

    @Autowired
    private ReservationRepository courseRepository;

    @PostMapping
    public Reservation saveCourse(@RequestBody Reservation course) {
        return courseRepository.save(course);
    }
}
