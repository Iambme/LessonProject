package homework.spring.ex1.repo;


import homework.spring.ex1.model.Human;
import org.springframework.data.repository.CrudRepository;

public interface HumanRepo extends CrudRepository<Human, Integer>  {
}
