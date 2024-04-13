public class Principal {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.name= "Encanto";
        myMovie.releaseDate = 2021;
        myMovie.durationMinutes = 120;

        myMovie.showTechnicalSheet();
        myMovie.assess(10);
        myMovie.assess(10);
        System.out.println(myMovie.sumOfEvaluations);
        System.out.println(myMovie.totalEvaluations);
        System.out.println(myMovie.calculateAverage());

        Movie otherMovie = new Movie();
        otherMovie.name= "Matrix";
        otherMovie.releaseDate = 1998;
        otherMovie.durationMinutes = 180;

//       otherMovie.showTechnicalSheet();
    }
}
