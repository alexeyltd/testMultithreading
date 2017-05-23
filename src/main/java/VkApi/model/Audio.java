package VkApi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Audio implements Serializable {

    private int id;

    public int getId() { return this.id; }

    public void setId(int id) { this.id = id; }

    private int owner_id;

    public int getOwnerId() { return this.owner_id; }

    public void setOwnerId(int owner_id) { this.owner_id = owner_id; }

    private String artist;

    public String getArtist() { return this.artist; }

    public void setArtist(String artist) { this.artist = artist; }

    private String title;

    public String getTitle() { return this.title; }

    public void setTitle(String title) { this.title = title; }

    private int duration;

    public int getDuration() { return this.duration; }

    public void setDuration(int duration) { this.duration = duration; }

    private int date;

    public int getDate() { return this.date; }

    public void setDate(int date) { this.date = date; }

    private int content_restricted;

    public int getContentRestricted() { return this.content_restricted; }

    public void setContentRestricted(int content_restricted) { this.content_restricted = content_restricted; }

    private String url;

    public String getUrl() { return this.url; }

    public void setUrl(String url) { this.url = url; }

    private int genre_id;

    public int getGenreId() { return this.genre_id; }

    public void setGenreId(int genre_id) { this.genre_id = genre_id; }

    private int no_search;

    public int getNoSearch() { return this.no_search; }

    public void setNoSearch(int no_search) { this.no_search = no_search; }

}
