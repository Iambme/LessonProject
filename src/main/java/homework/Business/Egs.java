package homework.Business;

import java.util.ArrayList;

public class Egs extends Company {
    private int countOfTariff;
    private ArrayList<String> namesOfTariffs = new ArrayList<String>();

    public Egs(String director, int employee, int marketValue, int countOfTariff) {
        super(director, employee, marketValue);
        this.countOfTariff = countOfTariff;
    }
    public void addNewTariff(String tariff){
        namesOfTariffs.add(tariff);
        System.out.println("Новый тариф добавлен");
    }

    public int getCountOfTariff() {
        return countOfTariff;
    }

    public void setCountOfTariff(int countOfTariff) {
        this.countOfTariff = countOfTariff;
    }

    public ArrayList<String> getNamesOfTariffs() {
        return namesOfTariffs;
    }

    @Override
    public void printSpecificInfo() {
        super.printSpecificInfo();
        System.out.println("стоимость тарифа " +countOfTariff + " Список тарифов " + namesOfTariffs);
    }
}
