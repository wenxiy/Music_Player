package com.example.player_demo.sevice.bean;

import android.os.Bundle;
import android.provider.MediaStore;

public class Song {
    private String title;
    private String artist;
    private String album;
    private long duration;
    private long id;
    private String url;

    public Song() {
    }

    public Song(String title, String artist, String album, long duration, long id, String url) {
        this.url = url;
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
