package com.example.streak.technospandan.model;

public enum AllEvents {
    CODING("Coding Events"),
    ROBOTICS("Robotics Events"),
    ELECTRONICS("Electrade");

    private final String event;

    AllEvents(String event) {
        this.event = event;
    }

    public String getEvent() {
        return event;
    }
}
