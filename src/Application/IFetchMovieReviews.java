package Application;

import Domain.MovieReview;
import Domain.MovieSearchRequest;

import java.util.List;

/**
 * Интерфейс для взаимодействия с внешним слоем. Его реализуют адаптеры для получения обзоров из хранилищ.
 */
public interface IFetchMovieReviews {
    public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest);
}
