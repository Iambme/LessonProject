package lesson.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("lesson.spring.config");
//        User user = context.getBean(User.class);
//        user.setAge(20);
//        user.setName("Ivan");
//        System.out.println(user);
//
//
//        User user2 = context.getBean(User.class);
//        System.out.println(user2);


        PhoneService phoneService = context.getBean(PhoneService.class);
        phoneService.getAll();

    }
}
