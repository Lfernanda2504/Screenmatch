package com.aluracursos.screenmatch.models;

public class Title {
    private String name;
    private int releaseDate;
    private int durationMinutes;
    private boolean includedPlan;
    private double sumOfEvaluations;
    private int totalEvaluations;

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setIncludedPlan(boolean includedPlan) {
        this.includedPlan = includedPlan;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public boolean isIncludedPlan() {
        return includedPlan;
    }

    int getTotalEvaluations() {
        return totalEvaluations;
    }

    public void showTechnicalSheet() {
        System.out.println("El nombre de la  película es: " + name);
        System.out.println("Su fecha de lanzamiento es: " + releaseDate);
        System.out.println("Duración en minutos: " + durationMinutes);
    }

    public void assess(double note) {
        sumOfEvaluations += note;
        totalEvaluations++;
    }

    public double calculateAverage() {
        return sumOfEvaluations / totalEvaluations;
    }
}
