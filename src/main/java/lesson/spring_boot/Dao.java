package lesson.spring_boot;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Dao<T> {
    void save(T t);
    List<T> getAll();
}
