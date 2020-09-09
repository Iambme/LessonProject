package lesson.spring;

import org.springframework.stereotype.Service;

import java.util.List;


public interface Dao<T> {
    void save(T t);
    List<T> getAll();
}
