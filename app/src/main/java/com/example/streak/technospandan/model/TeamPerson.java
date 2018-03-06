package com.example.streak.technospandan.model;

/**
 * Created by betterclever on 2/21/2017.
 */

public class TeamPerson {
    private int imageRef;
    private String name;
    private String role;
    private String number;
    private String githubLink;
    private boolean isDeveloper;
    
    public TeamPerson(int imageRef, String name, String role, String number, String githubLink, boolean isDeveloper) {
        this.imageRef = imageRef;
        this.name = name;
        this.role = role;
        this.number = number;
        this.githubLink = githubLink;
        this.isDeveloper = isDeveloper;
    }
    
    public int getImageRef() {
        return imageRef;
    }
    
    public String getName() {
        return name;
    }
    
    public String getRole() {
        return role;
    }
    
    public String getNumber() {
        return number;
    }
    
    public String getGithubLink() {
        return githubLink;
    }
    
    public boolean isDeveloper() {
        return isDeveloper;
    }
}
