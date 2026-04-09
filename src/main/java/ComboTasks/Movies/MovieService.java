package ComboTasks.Movies;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class MovieService {
    private final Map<Movie, List<Rating<? extends Number>>> ratings = new ConcurrentHashMap<>();

    public void addRating(Movie movie,Rating<? extends Number> rating){
        double value = rating.convertToDouble();

        if (value < 1 || value > 10){
            throw new IllegalArgumentException("Error, raiting not valide");
        }

        ratings.computeIfAbsent(movie,m -> new CopyOnWriteArrayList<>()).add(rating);
    }

    public double getAverageRating(Movie movie){
        List<Rating<? extends Number>> movieRatings = ratings.get(movie);

        if (movieRatings == null){
            return 0.0;
        }
        if (movieRatings.isEmpty()){
            return  0.0;
        }
        return movieRatings.stream().mapToDouble(Rating::convertToDouble).average().orElse(0.0);
    }

    public List<Movie> getSortedMovie(){
        return ratings.keySet().stream()
                .sorted((m1 , m2) -> Double.compare(getAverageRating(m2),getAverageRating(m1)))
                .collect(Collectors.toList());
    }
}
