package com.example.examhelper.dto;


//TODO dodac co wgl zawiera event
public class Event {

    int day;
    int month;
    int year;

    String name;
    int level;

    public Event(int day, int month, int year, String name, int level) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.name = name;
        this.level = level;
    }

    public Event() {
        this.day = 0;
        this.month = 0;
        this.year = 0;
        this.name = "";
        this.level = 0;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }
}
