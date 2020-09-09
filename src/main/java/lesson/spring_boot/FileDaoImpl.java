package lesson.spring_boot;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileDaoImpl implements Dao<Phone> {
    @Override
    public void save(Phone phone) {
        System.out.println("Сохранили телефон в файл");
    }

    @Override
    public List<Phone> getAll() {
        System.out.println("Достали телеофны из файла");
        return null;
    }
}
