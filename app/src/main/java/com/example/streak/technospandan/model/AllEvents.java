package com.example.streak.technospandan.model;

public enum AllEvents {
    CODING("Codetrex, Play with codes, App-athon, Crypto"),
    ROBOTICS("The Robo Knight, Robo Race, LFR"),
    ELECTRONICS("Electrade, Electromatrix"),
    Location("10-12 AM"),
    About("Boom"),
    Organiser("Piyush");


    private final String event;

    AllEvents(String event) {
        this.event = event;
    }

    public String getEvent() {
        return event;
    }
}
