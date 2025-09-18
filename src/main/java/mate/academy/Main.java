package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movieToAdd = new Movie();
        movieToAdd.setTitle("Inception");
        movieToAdd.setDescription("A mind-bending thriller by Christopher Nolan.");

        Movie addedMovie = movieService.add(movieToAdd);
        System.out.println("Added movie: " + addedMovie);
    }
}
