package com.example.examhelper.controllers;

import com.example.examhelper.data.DummyDatabase;
import com.example.examhelper.dto.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventsController {

    @Autowired
    private DummyDatabase dummyDatabase;

    @GetMapping("/events")
    public List<Event> getEvent() {
        return dummyDatabase.getEvents();
    }

    //TODO dodac POST mapping do zapisywania
    //TODO get mapping dla pojedynczego eventu
    //sprobowac dodac

}
