package homework.spring.ex1;

import homework.spring.ex1.config.Config;
import homework.spring.ex1.model.License;
import homework.spring.ex1.repo.HumanRepo;
import homework.spring.ex1.repo.LicenseRepo;
import homework.spring.ex1.service.Service;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        /*

Создать dao паттер и, используя spring, создать репозитории и реализовать отношение один к одному
 для сущностей человек - водительские права.
Создать консольное меню:
1. Добавить человека
2. Извлечь имя человека по id
3. Добавить права человеку
4. Вывести имя человека и его права по Id человека
5. Изменить права человека по id человека
6. Удалить информацию о человеке по id
7. Выход
         */
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        HumanRepo humanRepo = (HumanRepo) context.getBean(HumanRepo.class);
        LicenseRepo licenseRepo = (LicenseRepo) context.getBean(LicenseRepo.class);
        Service.go(humanRepo,licenseRepo);
    }
}
