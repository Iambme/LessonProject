package homework.optional.ex1;

import lesson.loging.ex1.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public class Company {
    private String name;
    private int balance;

    public Company(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void pay(Bill bill) {
        Logger logger = LoggerFactory.getLogger(Company.class);
        Optional<Bill> billOptional = Optional.ofNullable(bill);

        billOptional.ifPresentOrElse(b->{
                    this.balance = balance - b.getSum();
                    logger.info("Счет " + b.getId() + " " + b.getName() + " Оплачен");
                },
                ()->logger.warn("bill is null"));

    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
