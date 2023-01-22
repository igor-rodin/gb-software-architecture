package Adapters;

import Application.IFetchMovieReviews;
import Domain.MovieReview;
import Domain.MovieSearchRequest;

import java.util.*;

/**
 * Класс принадлежит к слою frameworks. Служит для взаимодествия с внешним миром,
 * содержит реализацию интерфейса для получения обзоров на фильмы из внешнего хранилища (из hashmap).
 */
public class MovieReviewsRepo implements IFetchMovieReviews {
    private Map<String, List<MovieReview>> movieReviewMap;

    public MovieReviewsRepo() {
        initialize();
    }

    public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest) {

        return Optional.ofNullable(movieReviewMap.get(movieSearchRequest.getMovieName()))
                .orElse(new ArrayList<>());
    }

    private void initialize() {
        this.movieReviewMap = new HashMap<>();
        movieReviewMap.put("StarWars", Collections.singletonList(new MovieReview("1", 7.5, "Good")));
        movieReviewMap.put("StarTreck", Arrays.asList(new MovieReview("1", 9.5, "Excellent"), new MovieReview("1", 8.5, "Good")));
    }
}
