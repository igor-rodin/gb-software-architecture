package Domain;

/**
 * Сущность из доменной области, описывающая запрос на обзор фильма
 */
public class MovieSearchRequest {
    String request;

    public MovieSearchRequest(String name) {
        this.request = name;
    }

    public String getMovieName() {
        return request;
    }
}
