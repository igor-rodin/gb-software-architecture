package Application;

import Domain.MovieReview;
import Domain.MovieSearchRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Класс содержит основную бизнес-логику выборки, фильтрации и выода пользователю обзоров на фильмы.
 * Не зависит от внешнего слоя
 */
public class MovieApp {

    private static Random rand = new Random();
    private IFetchMovieReviews fetchMovieReviews;
    private IPrintMovieReviews printMovieReviews;

    public MovieApp(IFetchMovieReviews fetchMovieReviews, IPrintMovieReviews printMovieReviews) {
        this.fetchMovieReviews = fetchMovieReviews;
        this.printMovieReviews = printMovieReviews;
    }

    private List<MovieReview> filterRandomReviews(List<MovieReview> movieReviewList) {
        List<MovieReview> result = new ArrayList<MovieReview>();
        // logic to return random reviews
        for (int index = 0; index < 5; ++index) {
            if (movieReviewList.size() < 1)
                break;
            int randomIndex = getRandomElement(movieReviewList.size());
            MovieReview movieReview = movieReviewList.get(randomIndex);
            movieReviewList.remove(movieReview);
            result.add(movieReview);
        }
        return result;
    }

    private int getRandomElement(int size) {
        return rand.nextInt(size);
    }

    public void accept(MovieSearchRequest movieSearchRequest) {
        List<MovieReview> movieReviewList = fetchMovieReviews.fetchMovieReviews(movieSearchRequest);
        List<MovieReview> randomReviews = filterRandomReviews(new ArrayList<>(movieReviewList));
        printMovieReviews.writeMovieReviews(randomReviews);
    }
}
