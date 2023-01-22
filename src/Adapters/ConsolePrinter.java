package Adapters;

import Application.IPrintMovieReviews;
import Domain.MovieReview;

import java.util.List;

/**
 * Класс принадлежит к слою frameworks. Служит для взаимодествия с внешним миром,
 * содержит реализацию интерфейса для отображения обзоров фильмов в консоли.
 */
public class ConsolePrinter implements IPrintMovieReviews {
    @Override
    public void writeMovieReviews(List<MovieReview> movieReviewList) {
        movieReviewList.forEach(movieReview -> {
            System.out.println(movieReview.toString());
        });
    }
}
