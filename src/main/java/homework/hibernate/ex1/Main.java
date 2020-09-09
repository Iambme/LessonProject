package homework.hibernate.ex1;


import homework.hibernate.HibernateUtil;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
 2. С помощью hibernate реализовать отношение один к одному для сущностей человек - водительские права.
Заполнить базу через hibernate.
Выполнить crud действия (create-read-update-delete).
 При удалении информации о человеке из базы, информация о водительских правах также должна удаляться
         */

        Session session = HibernateUtil.createSessionFactory().openSession();
        //Create
//
//        Driver d1 = new Driver("Vasily");
//        License l1 = new License(12345);
//        d1.setLicense(l1);
//        l1.setDriver(d1);
//        session.beginTransaction();
//        session.save(d1);
//        session.save(l1);
//        session.getTransaction().commit();


        //Read

        Driver driverRead = (Driver) session.createQuery("from Driver where id = 1").getSingleResult();
        System.out.println(driverRead);
        System.out.println(driverRead.getLicense());

        //Update
        session.beginTransaction();

        driverRead.setName("Sony2");

        //Driver mergedDriver = (Driver) session.merge(driverRead);
//        System.out.println(mergedDriver);
//        System.out.println(mergedDriver.getLicense());
        session.getTransaction().commit();


        //Delete
//        session.beginTransaction();
//        session.remove(driverRead);
//        session.getTransaction().commit();


    }
}
