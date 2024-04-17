import com.aluracursos.screenmatch.calculos.TimeCalculator;
import com.aluracursos.screenmatch.models.Movie;
import com.aluracursos.screenmatch.models.Series;

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

        Movie otherMovie = new Movie();
        otherMovie.setName("Matrix");
        otherMovie.setReleaseDate(1998);
        otherMovie.setDurationMinutes(180);

        Series mySeries = new Series();
        mySeries.setName("Casa del dragón");
        mySeries.setReleaseDate(2022);
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

    }
}
