package lesson.spring.config;

import lesson.spring.Phone;
//import lesson.spring.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("lesson.spring")
public class Config {
//
//    @Bean
//    @Scope(value = "prototype")
//    public User userBean(){
//        return new User();
//    }

    @Bean
    @Scope(value = "prototype")
    public Phone phoneBean(){
        return new Phone("IPhone x");
    }

//    @Bean
//    @Qualifier("FileDaoImpl")
//    public Dao getDao(){
//        return new FileDaoImpl();
//    }
//
//    @Bean
//    public Service getService(){
//        return  new Service();
//    }
}
