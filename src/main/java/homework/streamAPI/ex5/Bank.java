package homework.streamAPI.ex5;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Deposit> deposits;

    public Bank() {
        this.deposits = new ArrayList<>();
    }

    public ArrayList<Deposit> getDeposits() {
        return deposits;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "deposits=" + deposits +
                '}';
    }
}
