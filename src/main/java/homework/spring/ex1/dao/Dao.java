package homework.spring.ex1.dao;


import homework.spring.ex1.model.Human;
import homework.spring.ex1.model.License;

public interface Dao {
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
    void saveHuman(Human human);
    Human readHuman(int id);
    void saveLicense(int id, License license);
    void updateLicense(int id);
    void deleteHuman(int id);

}
