package com.example.streak.technospandan.model;

public class EventsModel {

    private String name;
    private AllEvents event;


    public EventsModel(String name, AllEvents event) {
        this.name = name;
        this.event = event;

    }

    public String getName() {
        return name;
    }

    public AllEvents getEvent() {
        return event;
    }

}
