package com.example.streak.technospandan.model;

public class EventsModel {

    private String name;
    private AllEvents event;
    private long score;

    public EventsModel(String name, AllEvents event, long score) {
        this.name = name;
        this.event = event;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public AllEvents getCountry() {
        return event;
    }

    public long getScore() {
        return score;
    }
}
