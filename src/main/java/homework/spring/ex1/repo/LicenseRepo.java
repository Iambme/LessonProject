package homework.spring.ex1.repo;

import homework.spring.ex1.model.License;
import org.springframework.data.repository.CrudRepository;

public interface LicenseRepo extends CrudRepository<License,Integer> {
}
