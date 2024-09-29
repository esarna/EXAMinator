package com.example.examhelper.data;

import com.example.examhelper.dto.Event;

import java.util.List;

public interface DatabaseInterface {
    void saveEvent(Event event);

    Event getEvent(int id);

    List<Event> getEvents();

    //TODO dodac metody edit event, delete event
}
