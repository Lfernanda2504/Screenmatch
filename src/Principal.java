import com.aluracursos.screenmatch.models.Movie;

public class Principal {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("Encanto");
        myMovie.setReleaseDate(2021);
        myMovie.setDurationMinutes(120);
        myMovie.setIncludedPlan(true);

        myMovie.showTechnicalSheet();
        myMovie.assess(10);
        myMovie.assess(10);
        myMovie.assess(7.8);

        System.out.println("Média de evaluaciones de la película: " +myMovie.calculateAverage());

//        com.aluracursos.screenmatch.models.Movie otherMovie = new com.aluracursos.screenmatch.models.Movie();
//        otherMovie.name= "Matrix";
//        otherMovie.releaseDate = 1998;
//        otherMovie.durationMinutes = 180;


    }
}
