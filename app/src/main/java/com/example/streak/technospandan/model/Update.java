package com.example.streak.technospandan.model;

/**
 * Created by PIYUSH on 28-01-2018.
 */

public class Update {
    private String title;
    private String eventID;
    private String message;
    private String time;
    private String date;

    public Update(){

    }

    public Update(String title, String eventID, String message, String time, String date) {
        this.title = title;
        this.eventID = eventID;
        this.message = message;
        this.time = time;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
