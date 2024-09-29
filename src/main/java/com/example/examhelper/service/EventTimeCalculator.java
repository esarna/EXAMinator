package com.example.examhelper.service;

import com.example.examhelper.dto.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examhelper.data.DummyDatabase;

@Service
public class EventTimeCalculator {

    private final DummyDatabase dummyDatabase;

    @Autowired
    public EventTimeCalculator(DummyDatabase dummyDatabase) {
        this.dummyDatabase = dummyDatabase;
    }

    public int calculate(Event event) {
        Event ev1 = new Event(event.getDay() - 1, event.getMonth(), event.getYear(), event.getName() + " revise", event.getLevel());
        dummyDatabase.saveEvent(ev1);

        if (event.getLevel() == 1) {
            Event ev2 = new Event(event.getDay() - 3, event.getMonth(), event.getYear(), event.getName() + " revise", event.getLevel());
            dummyDatabase.saveEvent(ev2);
        } else if (event.getLevel() == 2) {
            Event ev2 = new Event(event.getDay() - 3, event.getMonth(), event.getYear(), event.getName() + " revise", event.getLevel());
            Event ev3 = new Event(event.getDay() - 5, event.getMonth(), event.getYear(), event.getName() + " revise", event.getLevel());
            dummyDatabase.saveEvent(ev2);
            dummyDatabase.saveEvent(ev3);
        } else if (event.getLevel() == 3) {
            Event ev2 = new Event(event.getDay() - 3, event.getMonth(), event.getYear(), event.getName() + " revise", event.getLevel());
            Event ev3 = new Event(event.getDay() - 5, event.getMonth(), event.getYear(), event.getName() + " revise", event.getLevel());
            Event ev4 = new Event(event.getDay() - 7, event.getMonth(), event.getYear(), event.getName() + " revise", event.getLevel());
            dummyDatabase.saveEvent(ev2);
            dummyDatabase.saveEvent(ev3);
            dummyDatabase.saveEvent(ev4);
        }

        return 1234;
    }
}
