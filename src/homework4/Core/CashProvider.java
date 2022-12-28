package homework4.Core;

import homework4.Interfaces.ICarrierRepo;
import homework4.Interfaces.ICashRepo;
import homework4.Interfaces.IUserRepo;
import homework4.Models.Carrier;
import homework4.Models.Ticket;
import homework4.Models.User;
import homework4.Services.CarrierRepository;
import homework4.Services.CashRepository;
import homework4.Services.UserRepository;

/**
 * Класс - провайдер для взаимодействия с банком и базой перевозчиков
 */
public class CashProvider {
    private ICarrierRepo carrierRepository;
    private ICashRepo cashRepository;
    private long cardNumber;
    private boolean isAuthorized;

    /**
     * Конструктор класса
     */
    public CashProvider() {
        // Класс репозитория находится в единственном экземпляре для того, чтобы не создавать несколько подключений
        // к базе данных. Реализация паттерна Синглтон.
        this.carrierRepository = CarrierRepository.getCarrierRepository();
        this.cashRepository = CashRepository.getCashRepository();
    }

    /**
     * Метод покупки билета
     *
     * @param ticket билет
     * @return результат выполнения операции
     * @throws RuntimeException
     */
    // подсказка  Carrier carrier = carrierRepository.read(1);
    // подсказка  return cashRepository.transaction(ticket.getPrice(), cardNumber, carrier.getCardNumber());
    boolean buy(Ticket ticket) {
        Carrier carrier = carrierRepository.read(1);
        return cashRepository.transaction(ticket.getPrice(), cardNumber, carrier.getCardNumber());
    }


    /**
     * Метод авторизации клиента. Здесь должно быть реализовано обращение к банку для подтверждения личности клиента.
     *
     * @param client
     */
    void authorization(User client) {
        IUserRepo userRepo = UserRepository.getClientRepository();
        try {
            userRepo.read(client.getUserName());
            isAuthorized = true;
            cardNumber = client.getCardNumber();
        } catch (RuntimeException e) {
            isAuthorized = false;
        }

    }
}
