package Application;

import Domain.MovieReview;
import Domain.MovieSearchRequest;

import java.util.List;

public interface IFetchMovieReviews {
    public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest);
}
