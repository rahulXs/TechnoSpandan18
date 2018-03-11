package com.example.streak.technospandan.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sponsor {
    
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("value")
    @Expose
    private String value;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("website")
    @Expose
    private String website;
    
    /**
     * No args constructor for use in serialization
     *
     */
    public Sponsor() {
    }
    
    /**
     *
     * @param website
     * @param name
     * @param value
     * @param image
     */
    public Sponsor(String name, String value, String image, String website) {
        super();
        this.name = name;
        this.value = value;
        this.image = image;
        this.website = website;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getValue() {
        return value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }
    
    public String getImage() {
        return image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }
    
    public String getWebsite() {
        return website;
    }
    
    public void setWebsite(String website) {
        this.website = website;
    }
    
}