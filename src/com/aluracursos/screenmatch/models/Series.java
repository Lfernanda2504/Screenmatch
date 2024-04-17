package com.aluracursos.screenmatch.models;

public class Series extends Title {
    int season;
    int episodesSeason;
    int minutesEpisode;

    @Override
    public int getDurationMinutes() {
        return season * episodesSeason * minutesEpisode;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getEpisodesSeason() {
        return episodesSeason;
    }

    public void setEpisodesSeason(int episodesSeason) {
        this.episodesSeason = episodesSeason;
    }

    public int getMinutesEpisode() {
        return minutesEpisode;
    }

    public void setMinutesEpisode(int minutesEpisode) {
        this.minutesEpisode = minutesEpisode;
    }
}
