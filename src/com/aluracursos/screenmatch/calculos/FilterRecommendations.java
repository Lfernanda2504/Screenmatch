package com.aluracursos.screenmatch.calculos;

public class FilterRecommendations {

    public void filter (Classification classification){
        if (classification.getClassification() >= 4 ){
            System.out.println("Muy bien evaluado en el momento");
        } else if (classification.getClassification() >=2 ) {
            System.out.println("Popular en el momento");
        }else {
            System.out.println("Ingresar a tu lista para verlo después");
        }
    }
}
