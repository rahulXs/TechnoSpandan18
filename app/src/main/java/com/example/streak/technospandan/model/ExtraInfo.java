package com.example.streak.technospandan.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExtraInfo {
    
    @SerializedName("infoTitle")
    @Expose
    private String infoTitle;
    @SerializedName("infoDetail")
    @Expose
    private String infoDetail;
    
    public ExtraInfo() {
    }
    
    public ExtraInfo(String infoTitle, String infoDetail) {
        super();
        this.infoTitle = infoTitle;
        this.infoDetail = infoDetail;
    }
    
    public String getInfoTitle() {
        return infoTitle;
    }
    
    public void setInfoTitle(String infoTitle) {
        this.infoTitle = infoTitle;
    }
    
    public String getInfoDetail() {
        return infoDetail;
    }
    
    public void setInfoDetail(String infoDetail) {
        this.infoDetail = infoDetail;
    }
    
}