package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.models.Movie;
import com.aluracursos.screenmatch.models.Series;
import com.aluracursos.screenmatch.models.Title;

import java.util.ArrayList;

public class PrincipalWithList {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Encanto", 2021);
        myMovie.assess(9);
        Movie otherMovie = new Movie("Matrix", 1998);
        otherMovie.assess(6);
        Movie movie1 = new Movie("Avatar", 2009);
        movie1.assess(10);
        Movie movie2 = new Movie("El señor de los anillos", 2001);
        var movieDisney = new Movie("Buscando a Dory", 2016);


        Series mySeries = new Series("Casa del dragón", 2022);
        Series series = new Series("La Casa de Papel", 2017);
        ArrayList<Title> list  = new ArrayList<>();
        list.add(myMovie);
        list.add(otherMovie);
        list.add(movieDisney);
        list.add(movie1);
        list.add(movie2);
        list.add(mySeries);

        for (Title item : list) {
            System.out.println(item.getName());
            if (item instanceof Movie movie && movie.getClassification()>2 ){
                //casting clase
//                Movie movie = (Movie) item;
                System.out.println("Clasificacion: " +movie.getClassification());
            }


        }
    }
}
