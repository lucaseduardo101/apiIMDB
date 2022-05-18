import domain.usecases.GetMovies;

public class Main {
    public static void main(String[] args) {
        GetMovies movie = new GetMovies();

     System.out.println( movie.getTop250().toString() );
    }
}
