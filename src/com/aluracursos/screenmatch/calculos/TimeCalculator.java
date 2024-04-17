package com.aluracursos.screenmatch.calculos;
import com.aluracursos.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void includes(Title title){
        this.totalTime += title.getDurationMinutes();
    }
}
