package homework4.Core;

import homework4.Interfaces.ITicketRepo;
import homework4.Models.Ticket;
import homework4.Services.TicketRepository;

import java.util.List;

/**
 * Класс - провайдер для работы с базой данных билетов
 */
public class TicketProvider {

    public TicketProvider() {
        // Класс репозитория находится в единственном экземпляре для того, чтобы не создавать несколько подключений
        // к базе данных. Реализация паттерна Синглтон.
        this.ticketRepo = TicketRepository.getTicketRepository();
    }

    /**
     * Метод получения билетов из базы данных
     *
     * @param routeNumber номер маршрута
     * @return список билетов
     * @throws RuntimeException
     */


    /**
     * Метод обновления статуса билета
     *
     * @param ticket билет
     * @return результат выполнения операции
     */

}
