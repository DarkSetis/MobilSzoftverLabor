package com.example.gamelister.model.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class GamePlatform {

    @SerializedName("api_detail_url")
    @Expose
    private String api_detail_url;

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("name")
    @Expose
    private String name;


    @SerializedName("site_detail_url")
    @Expose
    private String site_detail_url;

    @SerializedName("abbrevation")
    @Expose
    private String abbrevation;

    public String getApi_detail_url() {
        return api_detail_url;
    }

    public void setApi_detail_url(String api_detail_url) {
        this.api_detail_url = api_detail_url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSite_detail_url() {
        return site_detail_url;
    }

    public void setSite_detail_url(String site_detail_url) {
        this.site_detail_url = site_detail_url;
    }

    public String getAbbrevation() {
        return abbrevation;
    }

    public void setAbbrevation(String abbrevation) {
        this.abbrevation = abbrevation;
    }
}

