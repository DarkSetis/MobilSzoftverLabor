package com.example.gamelister.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImageTags {

    @SerializedName("api_detail_url")
    @Expose
    private String api_detail_url;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("total")
    @Expose
    private int total;

    public String getApi_detail_url() {
        return api_detail_url;
    }

    public void setApi_detail_url(String api_detail_url) {
        this.api_detail_url = api_detail_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
