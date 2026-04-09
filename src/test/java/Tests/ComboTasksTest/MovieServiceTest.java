package Tests.ComboTasksTest;

import ComboTasks.Movies.Movie;
import ComboTasks.Movies.MovieService;
import ComboTasks.Movies.Rating;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MovieServiceTest {
    private MovieService service;
    private Movie movie1;
    private Movie movie2;
    private Movie movie3;

    @BeforeEach
    void setUp(){
        service = new MovieService();
        movie1 = new Movie("Avengers 1");
        movie2 = new Movie("Avengers 2");
        movie3 = new Movie("Avengers 3");
    }

    @Test
    public void addRatingAndCalculateAVG(){
        service.addRating(movie1,new Rating<>(8));
        service.addRating(movie1,new Rating<>(10));

        double avg = service.getAverageRating(movie1);

        assertEquals(9.0,avg);
    }

    @Test
    public void addZeroRatingAndCalculateAVG(){
        double avg = service.getAverageRating(movie1);

        assertEquals(0.0,avg);
    }

    @Test
    public void checkThrowException(){
        assertThrows(IllegalArgumentException.class,() -> {service.addRating(movie1,new Rating<>(11));});
    }

    @Test
    public void checkSortedMovies(){
        service.addRating(movie1,new Rating<>(5));
        service.addRating(movie2,new Rating<>(6));
        service.addRating(movie3,new Rating<>(7));

        List<Movie> movies = service.getSortedMovie();

        assertEquals(movie3,movies.get(0));
        assertEquals(movie2,movies.get(1));
        assertEquals(movie1,movies.get(2));
    }

    @Test
    public void checkSortedMoviesWithAVG(){
        service.addRating(movie1,new Rating<>(5));
        service.addRating(movie1,new Rating<>(6));
        service.addRating(movie1,new Rating<>(7));

        double movies = service.getAverageRating(movie1);

        assertEquals(6.0,movies);
    }

    @Test
    public void shouldBeThreadSafeWhenAddRating() throws InterruptedException {
        Runnable task = () -> {
            for(int i = 0; i < 1000; i ++){
                service.addRating(movie1,new Rating<>(8));
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        double avg = service.getAverageRating(movie1);

        assertEquals(8.0,avg);
    }
}
