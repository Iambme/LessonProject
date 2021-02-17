//package lesson.hibernate.ex1;
//
//import lesson.hibernate.Book;
//import lesson.hibernate.HibernateUtil;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) throws Exception {
//        SessionFactory sessionFactory = HibernateUtil.createSessionFactory();
//        Session session  = sessionFactory.openSession();
//
////        Book book = new Book("book2", 100); //new
////        session.beginTransaction();
////        session.save(book); //managed
////        session.getTransaction().commit();
//
////
////        List<Book> list = session.createQuery("from Book").list();
////
////
//        Book book1 = (Book)session.createQuery("from Book where id = 6").getSingleResult();
//        //Book book2 = new Book("book2", 30);
//        session.close();
//        sessionFactory.close();
//        //book1 переходи в состояние detached
//
//
//        sessionFactory = HibernateUtil.createSessionFactory();
//        book1.setPageCount(130);
//        session = sessionFactory.openSession();
//        session.beginTransaction();
//        session.merge(book1);
//        session.getTransaction().commit();
//
//        session.beginTransaction();
//        session.remove(book1); //removed
//        session.getTransaction().commit();
//
//
////        book1.setPageCount(10);
////        session = sessionFactory.openSession();
////        session.beginTransaction();
////        session.merge(book1);
////        session.getTransaction().commit();
//
//
//
//
//
//    }
//}
