package lesson.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PhoneService {
//    Dao<Phone> dao = new DataBaseDaoImpl();
//    Dao<Phone> dao = new FileDaoImpl();

    @Autowired
    @Qualifier("dataBaseDaoImpl")
    Dao<Phone> dao;

    public void save(Phone phone){
        dao.save(phone);
    }


    public void getAll(){
        dao.getAll();
    }
}
