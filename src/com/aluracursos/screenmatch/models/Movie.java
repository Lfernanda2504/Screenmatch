public class Movie {
    String name;
    int releaseDate;
    int durationMinutes;
    String includedPlan;
    private double sumOfEvaluations;
    private int totalEvaluations;

    int getTotalEvaluations(){
        return totalEvaluations;
    }

    void showTechnicalSheet () {
        System.out.println("El nombre de la  película es: " + name);
        System.out.println("Su fecha de lanzamiento es: " + releaseDate);
        System.out.println("Duración en minutos: " + durationMinutes);
    }
    void assess(double note){
     sumOfEvaluations += note;
     totalEvaluations++;
    }
    double calculateAverage(){
        return sumOfEvaluations / totalEvaluations;
    }
}
