package com.example.gamelister.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

class GameItem {

    @SerializedName("aliases")
    @Expose
    private List<String> aliases;

    @SerializedName("api_detail_url")
    @Expose
    private List<String> api_detail_url;

    @SerializedName("date_added")
    @Expose
    private Date date_added;

    @SerializedName("date_last_updated")
    @Expose
    private Date date_last_updated;

    @SerializedName("deck")
    @Expose
    private String deck;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("expected_release_day")
    @Expose
    private int expected_release_day;

    @SerializedName("expected_release_day")
    @Expose
    private int expected_release_month;

    @SerializedName("expected_release_day")
    @Expose
    private int expected_release_quarter;

    @SerializedName("expected_release_day")
    @Expose
    private int expected_release_year;

    @SerializedName("description")
    @Expose
    private String guid;

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("image")
    @Expose
    private Image image;

    @SerializedName("image_tags")
    @Expose
    private ImageTags image_tags;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("number_of_user_reviews")
    @Expose
    private int number_of_user_reviews;

    @SerializedName("original_game_rating")
    @Expose
    private List<OriginalGameRatingItem> original_game_rating;

    @SerializedName("original_release_date")
    @Expose
    private Date original_release_date;

    @SerializedName("platforms")
    @Expose
    private List<GamePlatform> platforms;

    @SerializedName("site_detail_url")
    @Expose
    private String site_detail_url;

    public List<String> getAliases() {
        return aliases;
    }

    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    public List<String> getApi_detail_url() {
        return api_detail_url;
    }

    public void setApi_detail_url(List<String> api_detail_url) {
        this.api_detail_url = api_detail_url;
    }

    public Date getDate_added() {
        return date_added;
    }

    public void setDate_added(Date date_added) {
        this.date_added = date_added;
    }

    public Date getDate_last_updated() {
        return date_last_updated;
    }

    public void setDate_last_updated(Date date_last_updated) {
        this.date_last_updated = date_last_updated;
    }

    public String getDeck() {
        return deck;
    }

    public void setDeck(String deck) {
        this.deck = deck;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getExpected_release_day() {
        return expected_release_day;
    }

    public void setExpected_release_day(int expected_release_day) {
        this.expected_release_day = expected_release_day;
    }

    public int getExpected_release_month() {
        return expected_release_month;
    }

    public void setExpected_release_month(int expected_release_month) {
        this.expected_release_month = expected_release_month;
    }

    public int getExpected_release_quarter() {
        return expected_release_quarter;
    }

    public void setExpected_release_quarter(int expected_release_quarter) {
        this.expected_release_quarter = expected_release_quarter;
    }

    public int getExpected_release_year() {
        return expected_release_year;
    }

    public void setExpected_release_year(int expected_release_year) {
        this.expected_release_year = expected_release_year;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public ImageTags getImage_tags() {
        return image_tags;
    }

    public void setImage_tags(ImageTags image_tags) {
        this.image_tags = image_tags;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber_of_user_reviews() {
        return number_of_user_reviews;
    }

    public void setNumber_of_user_reviews(int number_of_user_reviews) {
        this.number_of_user_reviews = number_of_user_reviews;
    }

    public List<OriginalGameRatingItem> getOriginal_game_rating() {
        return original_game_rating;
    }

    public void setOriginal_game_rating(List<OriginalGameRatingItem> original_game_rating) {
        this.original_game_rating = original_game_rating;
    }

    public Date getOriginal_release_date() {
        return original_release_date;
    }

    public void setOriginal_release_date(Date original_release_date) {
        this.original_release_date = original_release_date;
    }

    public List<GamePlatform> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(List<GamePlatform> platforms) {
        this.platforms = platforms;
    }

    public String getSite_detail_url() {
        return site_detail_url;
    }

    public void setSite_detail_url(String site_detail_url) {
        this.site_detail_url = site_detail_url;
    }
}
