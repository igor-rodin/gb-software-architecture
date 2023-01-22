package Adapters;

import Application.IFetchMovieReviews;
import Application.IPrintMovieReviews;
import Application.IUserInput;
import Application.MovieApp;
import Domain.Model;
import Domain.MovieSearchRequest;

/**
 * Класс принадлежит к слою frameworks. Служит для взаимодествия с внешним миром,
 * содержит реализацию интерфейса для обработки пользовательского ввода.
 */
public class UserCommand implements IUserInput {
    private Model model;

    public UserCommand(IFetchMovieReviews fetchMovieReviews, IPrintMovieReviews printMovieReviews) {
        MovieApp movieApp = new MovieApp(fetchMovieReviews, printMovieReviews);
        this.model = new Model(movieApp);
    }

    public void handleUserInput(Object userCommand) {
        model.Run((MovieSearchRequest)userCommand);
    }
}
