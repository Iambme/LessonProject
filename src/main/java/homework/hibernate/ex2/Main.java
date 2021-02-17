package homework.hibernate.ex2;

import homework.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;


public class Main {
    public static void main(String[] args) throws Exception {
        /*
3. С помощью hibernate реализовать отношение один ко многим у сущность человек-недвижимость.
Заполнить базу через hibernate, вывести всех людей и их объекты недвижимости
Удалить человека из базы по имени. При удалении человека из базы, информация о недвижимости, которой он владеет, также должна удаляться из базы
Отредактировать параметр недвижимости и проверить, что он изменился
         */

        Session session = HibernateUtil.createSessionFactory().openSession();
/*
        HouseOwner houseOwner1 = new HouseOwner("Owner1");
        HouseOwner houseOwner2 = new HouseOwner("Owner2");

        House house1 = new House("Moscow");
        house1.setHouseOwner(houseOwner1);
        House house2 = new House("Riga");
        house2.setHouseOwner(houseOwner1);
        House house3 = new House("New-York");
        house3.setHouseOwner(houseOwner2);
        House house4 = new House("London");
        house4.setHouseOwner(houseOwner2);
        Set<House> houses1 = new HashSet<>();
        houses1.add(house1);
        houses1.add(house2);
        houseOwner1.setHouses(houses1);
        Set<House> houses2 = new HashSet<>();
        houses2.add(house3);
        houses2.add(house4);
        houseOwner2.setHouses(houses2);

        session.beginTransaction();
        session.save(houseOwner1);
        session.save(house1);
        session.save(house2);
        session.save(houseOwner2);
        session.save(house3);
        session.save(house4);
        session.getTransaction().commit();
*/

        List<HouseOwner> houseOwners = (List<HouseOwner>) session.createQuery("from HouseOwner").list();
        for (HouseOwner h : houseOwners) {
            System.out.println(h);
            System.out.println(h.getHouses());
        }

        /* delete by name


        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from HouseOwner where name=:name");
        query.setParameter("name", "Owner2");
        HouseOwner houseOwner = (HouseOwner) query.uniqueResult();
        session.delete(houseOwner);
        tx.commit();

         */

        House house = (House) session.createQuery("from House where id = 1").getSingleResult();
        System.out.println(house);

        //update
        session.beginTransaction();
        //session.evict(house);
        house.setAddress("Zimbabwe2");
        session.getTransaction().commit();


    }
}
