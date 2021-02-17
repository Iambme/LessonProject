package lesson.spring;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataBaseDaoImpl implements Dao<Phone>{
    @Override
    public void save(Phone phone) {
        System.out.println("Сохранили телефон в базу");
    }

    @Override
    public List<Phone> getAll() {
        System.out.println("Достали телефоны из базы");
        return null;
    }
}
