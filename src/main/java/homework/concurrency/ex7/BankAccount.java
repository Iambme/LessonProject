package homework.concurrency.ex7;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public synchronized void addMoney(int money) {
        balance += money;
        System.out.println("банк пополнен на " + money + " и составляет " + balance);
    }
}
