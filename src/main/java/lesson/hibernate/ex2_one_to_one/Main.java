//package lesson.hibernate.ex2_one_to_one;
//
//import lesson.hibernate.HibernateUtil;
//import org.hibernate.Session;
//
//public class Main {
//    public static void main(String[] args) throws Exception {
//        Session session = HibernateUtil.createSessionFactory().openSession();
//        //сохранение
////        Human h1 = new Human("ivan");
////        HumanPassport p1 = new HumanPassport(1234, 123456);
//////        связываем:
////        h1.setHumanPassport(p1);
////        p1.setHuman(h1);
////        session.beginTransaction();
////        session.save(h1);
////        session.save(p1);
////        session.getTransaction().commit();
//
//
//
//        //Извлечить Human с id 1 со всеми полями
////        Human h1 = (Human)session.createQuery("from Human where id = 5").getSingleResult();
////        System.out.println(h1);
////        System.out.println(h1.getHumanPassport());
//
////        session.beginTransaction();
////        session.remove(h1);
////        session.getTransaction().commit();
//
//            //удаляем паспорт
////        HumanPassport p1 = (HumanPassport)session.createQuery("from HumanPassport where id = 6").getSingleResult();
////
////        session.beginTransaction();
////        session.remove(p1);
////        session.getTransaction().commit();
//    }
//}
