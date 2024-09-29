package com.example.examhelper.data;

import com.example.examhelper.dto.Event;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DummyDatabase implements DatabaseInterface{
    static int index = 0;
    Map<Integer, Event> events = generateDummyEvents();

    private static Map<Integer, Event> generateDummyEvents() {
        Map<Integer, Event> startingEvents = new HashMap<>();

        startingEvents.put(0, new Event(3, 8, 2025, "Matematyka", 3));
        startingEvents.put(1, new Event(12, 12, 2025, "Bazy danych", 2));
        startingEvents.put(2, new Event(23, 11, 2025, "Inzynieria oprogramowania", 2));
        startingEvents.put(3, new Event(25, 12, 2025, "Fizyka", 1));
        //TODO dodac poczatkowe eventy co sie beda same generowac

        return startingEvents;
    }

    @Override
    public void saveEvent(Event event) {
        events.put(index, event);
        index++;
    }

    @Override
    public Event getEvent(int id) {
        return events.get(id);
    }

    @Override
    public List<Event> getEvents() {
        return events.values().stream().toList();
    }
}
