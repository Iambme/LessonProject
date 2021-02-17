package lesson.spring_repository;


import lesson.spring_repository.model.Human;
import lesson.spring_repository.repo.HumanRepo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        HumanRepo humanRepo = (HumanRepo)context.getBean(HumanRepo.class);
        Iterable<Human> iterable = humanRepo.findAll();
        iterable.forEach(System.out::println);


//        Human h = humanRepo.findById(9).orElse(new Human());
//        h.setName("Oleg");
//        humanRepo.save(h);


        //create
//        Human newH = new Human();
//        newH.setName("Semen");
//        humanRepo.save(newH);


        //delete
//        Human h = humanRepo.findById(9).orElse(new Human());
//        humanRepo.delete(h);




    }
}
