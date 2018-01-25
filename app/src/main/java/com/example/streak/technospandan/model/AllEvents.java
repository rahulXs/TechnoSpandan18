package com.example.streak.technospandan.model;

public enum AllEvents {
    CODING("Codetrex, Play with codes, App-athon, Crypto"),
    ROBOTICS("The Robo Knight, Robo Race, LFR"),
    ELECTRONICS("Electrade, Electromatrix");


    private final String event;

    AllEvents(String event) {
        this.event = event;
    }

    public String getEvent() {
        return event;
    }
}
