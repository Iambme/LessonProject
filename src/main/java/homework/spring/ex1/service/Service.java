package homework.spring.ex1.service;

import homework.spring.ex1.dao.DaoImpl;
import homework.spring.ex1.model.Human;
import homework.spring.ex1.model.License;
import homework.spring.ex1.repo.HumanRepo;
import homework.spring.ex1.repo.LicenseRepo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Service {
    public static void go(HumanRepo humanRepo, LicenseRepo licenseRepo) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        DaoImpl dao = new DaoImpl(humanRepo, licenseRepo);

        boolean isOver = false;

        while (!isOver) {
            System.out.println("Выберите действие :\n" +
                    "1. Добавить человека\n" +
                    "2. Извлечь имя человека по id\n" +
                    "3. Добавить права человеку\n" +
                    "4. Вывести имя человека и его права по Id человека\n" +
                    "5. Изменить права человека по id человека\n" +
                    "6. Удалить информацию о человеке по id\n" +
                    "7. Выход");

            int userInput = Integer.parseInt(reader.readLine());
            switch (userInput) {
                case 1: {
                    System.out.println("Input Human name");
                    String inputName = reader.readLine();
                    Human human = new Human(inputName);
                    dao.saveHuman(human);
                    System.out.println("Human " + inputName + " has been saved");
                }
                break;
                case 2: {
                    int inputId = Integer.parseInt(reader.readLine());
                    Human human = dao.readHuman(inputId);
                    System.out.println(human.getName());
                }
                break;
                case 3: {
                    System.out.println("id человека, которому требуется добавить лицензию ");
                    int inputId = Integer.parseInt(reader.readLine());
                    System.out.println("number of license");
                    int inputLicense = Integer.parseInt(reader.readLine());
                    License license = new License(inputLicense);

                    dao.saveLicense(inputId, license);
                }
                break;

                case 4: {
                    int inputId = Integer.parseInt(reader.readLine());
                    Human human = dao.readHuman(inputId);
                    System.out.println(human.getName() + " " + human.getLicense());
                }
                break;

                case 5: {
                    int inputId = Integer.parseInt(reader.readLine());
                    dao.updateLicense(inputId);
                }
                break;

                case 6: {
                    int inputId = Integer.parseInt(reader.readLine());
                    dao.deleteHuman(inputId);
                }
                break;

                case 7: {
                    isOver = true;
                }
                break;
            }
        }
    }
}
