package Application;

import Domain.MovieSearchRequest;

/**
 * Класс содержит основную бизнес-логику обработки запроса пользователя на поиск запроса.
 * Не зависит от внешнего слоя
 */
public class MovieUser {
    private IUserInput userInputDriverPort;

    public MovieUser(IUserInput userInputDriverPort) {
        this.userInputDriverPort = userInputDriverPort;
    }

    public void processInput(MovieSearchRequest movieSearchRequest)
    {
        userInputDriverPort.handleUserInput(movieSearchRequest);
    }
}
