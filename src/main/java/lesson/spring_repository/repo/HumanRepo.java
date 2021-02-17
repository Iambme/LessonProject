package lesson.spring_repository.repo;


import lesson.spring_repository.model.Human;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface HumanRepo extends CrudRepository<Human, Integer> {
}
