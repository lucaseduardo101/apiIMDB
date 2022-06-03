package domain.usecases;

import com.fasterxml.jackson.databind.ObjectMapper;
import domain.entities.Response;
import domain.entities.Response250;
import domain.entities.ResponseMovie;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class ImdbApiClient {

    String token ;
    ObjectMapper mapper = new ObjectMapper();

    public ImdbApiClient(String token) {
        this.token = token;
    }

    public Response get(String movieName){

        String uri = "https://imdb-api.com/en/API/SearchMovie/"+ token + "/" + movieName;
        ResponseMovie response = null;

        try {
            HttpClient client =  HttpClient.newHttpClient();
            HttpRequest request = HttpRequest
                    .newBuilder()
                    .uri(new URI(uri))
                    .GET()
                    .timeout(Duration.ofSeconds(15))
                    .build();

            String body = client.send(request, HttpResponse.BodyHandlers.ofString()).body();

            response = mapper.readValue(body, ResponseMovie.class);

        } catch (URISyntaxException | IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return response;
    }

    public Response getTop250(){

        String uri = "https://imdb-api.com/en/API/Top250Movies/"+ token;

        Response250 response = null;

        try {
            HttpClient client =  HttpClient.newHttpClient();
            HttpRequest request = HttpRequest
                    .newBuilder()
                    .uri(new URI(uri))
                    .GET()
                    .timeout(Duration.ofSeconds(15))
                    .build();

            String body = client.send(request, HttpResponse.BodyHandlers.ofString()).body();

            response = mapper.readValue(body, Response250.class);

        } catch (URISyntaxException | IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return response;
    }
}

