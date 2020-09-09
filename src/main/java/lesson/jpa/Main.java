package lesson.jpa;

import org.hibernate.mapping.PersistentClass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.Period;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("testPersist");
        EntityManager em = factory.createEntityManager();
//        Human h = new Human("Ivan");
//        em.getTransaction().begin();
//        em.persist(h);
//        em.getTransaction().commit();



        List<Human> list = em.createQuery("from Human").getResultList();
        list.forEach(System.out::println);
//        Human h = list.get(0);
//        h.setName("Semen");
//        em.getTransaction().begin();
//        em.merge(h);
//        em.getTransaction().commit();
    }
}
