package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.calculos.FilterRecommendations;
import com.aluracursos.screenmatch.calculos.TimeCalculator;
import com.aluracursos.screenmatch.models.Episode;
import com.aluracursos.screenmatch.models.Movie;
import com.aluracursos.screenmatch.models.Series;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Encanto", 2021);

        myMovie.setDurationMinutes(120);
        myMovie.setIncludedPlan(true);

        myMovie.showTechnicalSheet();
        myMovie.assess(10);
        myMovie.assess(10);
        myMovie.assess(7.8);

        System.out.println("Média de evaluaciones de la película: " +myMovie.calculateAverage());

        Movie otherMovie = new Movie("Matrix", 1998);
//        otherMovie.setName("Matrix");

        otherMovie.setDurationMinutes(180);

        Series mySeries = new Series("Casa del dragón", 2022);

        mySeries.setSeason(1);
        mySeries.setMinutesEpisode(50);
        mySeries.setEpisodesSeason(10);
        mySeries.showTechnicalSheet();
        System.out.println(mySeries.getDurationMinutes());

        TimeCalculator calculator =new TimeCalculator();
        calculator.includes(myMovie);
        calculator.includes(otherMovie);
        calculator.includes(mySeries);
        System.out.println("Tiempo necesario para ver tus titulos favoritos estas vaciones "+ calculator.getTotalTime() + " minutos");

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setName("La casa Targaryen");
        episode.setSeries(mySeries);
        episode.setTotalViews(50);

        FilterRecommendations filterRecommendations = new FilterRecommendations();
        filterRecommendations.filter(myMovie);
        filterRecommendations.filter(episode);

        var movieDisney = new Movie("Buscando a Dory", 2016);
        movieDisney.setDurationMinutes(100);


        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(myMovie);
        movieList.add(otherMovie);
        movieList.add(movieDisney);

        System.out.println("Tamaño de la lista: " +movieList.size());
        System.out.println("La primera pélicula es: " +movieList.get(0).getName());

        System.out.println(movieList);
        System.out.println(movieList.get(0).toString());

//        Movie[] peliculas= new Movie[2];
//
          Movie movie1 = new Movie("Avatar", 2009);
          Movie movie2 = new Movie("El señor de los anillos", 2001);
//
//        peliculas[0] = movie1;
//        peliculas[1] = movie2;

    }

}
