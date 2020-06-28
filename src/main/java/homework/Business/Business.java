package homework.Business;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Random;

public class Business {
    public static void main(String[] args) {

        Apple apple = new Apple("Тим Кук", 1000, 3666);
        Finex finex = new Finex("Джо Босмер", 2000, 60000, 1234, 100);
        Egs egs = new Egs("Стив Палмер", 1200, 30000, 20);
        Finam finam = new Finam("Алистер Кроули", 3200, 35000,3.5);
        Samsung samsung = new Samsung("Ким Ки Нем", 2360, 62000);

        ArrayList<Company> companies = new ArrayList<Company>();

        companies.add(apple);
        companies.add(finex);
        companies.add(egs);
        companies.add(finam);
        companies.add(samsung);

        for (Company company : companies
        ) {
            System.out.println(company);
            System.out.println();
        }


        for (Company company : companies){
            company.printSpecificInfo();
            System.out.println();
        }

        Random random = new Random();
        int randomValue = random.nextInt(6);

        switch (randomValue){
            case 0 : apple.toFire();
            break;
            case 1 : finex.sellShares(50);
            break;
            case 2 : egs.addNewTariff("NewTariff");
            break;
            case 3 : apple.addNewPhoneModel("NewPhone");
            break;
            case 4 : samsung.addNewPhoneModel("NewPhone");
            break;
            case 5: finam.commissionReduction(1.2);
            break;

        }


    }
}

