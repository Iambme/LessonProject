package homework.Business;

import java.util.ArrayList;

public class Samsung extends Company {
    public ArrayList<String> getPhoneModels() {
        return phoneModels;
    }

    private ArrayList<String> phoneModels = new ArrayList<String>();

    public Samsung(String director, int employee, int marketValue) {
        super(director, employee, marketValue);
    }

    public void addNewPhoneModel(String phoneModel) {
        phoneModels.add(phoneModel);
        System.out.println("Новая модель добавлена в компании Samsung");
    }

    @Override
    public void printSpecificInfo() {
        super.printSpecificInfo();
        System.out.println("Модельный ряд устройств " + phoneModels);
    }
}
