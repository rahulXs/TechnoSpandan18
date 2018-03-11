package com.example.streak.technospandan.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Event {
    
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("organizers")
    @Expose
    private List<Organizer> organizers = null;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("type")
    @Expose
    private String type;
    
    /**
     * No args constructor for use in serialization
     */
    public Event() {
    }
    
    /**
     * @param time
     * @param location
     * @param description
     * @param name
     * @param image
     * @param organizers
     * @param type
     * @param date
     */
    public Event(String date, String description, String image, String location, String name, List<Organizer> organizers, String time, String type) {
        super();
        this.date = date;
        this.description = description;
        this.image = image;
        this.location = location;
        this.name = name;
        this.organizers = organizers;
        this.time = time;
        this.type = type;
    }
    
    public String getDate() {
        return date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getImage() {
        return image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public List<Organizer> getOrganizers() {
        return organizers;
    }
    
    public void setOrganizers(List<Organizer> organizers) {
        this.organizers = organizers;
    }
    
    public String getTime() {
        return time;
    }
    
    public void setTime(String time) {
        this.time = time;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
}