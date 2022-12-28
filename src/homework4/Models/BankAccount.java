package homework4.Models;

/**
 * Модель банковского аккаунта
 */
public class BankAccount {
    private long card;
    private long oldCard;
    private int balance;



    public BankAccount(long card) {
        oldCard = this.card;
        this.card = card;
        balance = 1000;
    }

    public long getCard() {
        return card;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount {" +
                " card= " + (String.format("%016d", card)) +
                ", balance= " + balance +
                " }";
    }
}
