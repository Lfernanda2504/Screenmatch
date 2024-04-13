package com.aluracursos.screenmatch.models;

public class Movie extends Title {
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    private String director;
}
