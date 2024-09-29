package com.example.examhelper.controllers;

import com.example.examhelper.dto.Event;
import com.example.examhelper.service.EventTimeCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/events")
public class TimeController {

    private final EventTimeCalculator eventTimeCalculator;

    @Autowired
    public TimeController(EventTimeCalculator eventTimeCalculator) {
        this.eventTimeCalculator = eventTimeCalculator;
    }

    @PostMapping("/calculate")
    public int getTime(@RequestBody Event event) {
        if (event == null) {
            throw new IllegalArgumentException("Event cannot be null");
        }
        return eventTimeCalculator.calculate(event);
    }
}
