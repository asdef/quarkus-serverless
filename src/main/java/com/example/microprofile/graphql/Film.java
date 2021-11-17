package com.example.microprofile.graphql;

import java.time.LocalDate;

public class Film {

    public String title;
    public Integer episodeID;
    public String director;
    public LocalDate releaseDate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getEpisodeID() {
        return episodeID;
    }

    public void setEpisodeID(Integer episodeID) {
        this.episodeID = episodeID;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}
