import adapters.HTMLGenerator;
import domain.entities.Response250;
import domain.usecases.GetMovies;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        GetMovies movie = new GetMovies();

        PrintWriter writer = new PrintWriter("/home/lucas/Documentos/index.html");

        HTMLGenerator generator = new HTMLGenerator(writer);
        Response250 response250 = (Response250) movie.getTop250();
        generator.generate(  response250.getItems());

        writer.close();
    }
}
