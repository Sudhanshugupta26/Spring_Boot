package in.gupta.main;

import in.gupta.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App
{
    public static void main( String[] args ) {
//        User user1 = new User();
//        user1.setName("Sudhanshu");
//        user1.setEmail("gupta@gmail");
//        user1.setPassword("gupta@123");
//        user1.setGender("Male");
//        user1.setCity("Lucknow");

        User user2 = new User();
        user2.setName("Tushar");
        user2.setEmail("tushar@gmail");
        user2.setPassword("tushar@123");
        user2.setGender("Male");
        user2.setCity("Lucknow");

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();  // Create SessionFactory object for configure Hibernate and handle connection.
        Session session = sessionFactory.openSession();    // Provide to do CRUD operation.
        Transaction transaction = session.beginTransaction();    // Provide to manage transaction.

        // Insert record in database.
//        try{
//            session.save(user2);
//            transaction.commit();
//        }catch(Exception e){
//            transaction.rollback();
//        }

        // Read record from database.
//        try{
//            User user = session.get(User.class, 3L);
//            if (user != null) {
//                System.out.println(user.getName() + " " + user.getEmail() + " " + user.getPassword() + " " + user.getGender() + " " + user.getCity());
//            }else{
//                System.out.println("No record found");
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        // Update record in database.
//        try {
//            User user = session.get(User.class, 1L);
////            user.setName("Sudhanshu");
////            session.update(user);
//            user.setName("Sudhanshu Gupta");
//            user.setEmail("guptasudhanshu@gmail.com");
//            user.setPassword("gupta@123");
//            user.setGender("Male");
//            user.setCity("Lucknow");
//            session.saveOrUpdate(user);
//            transaction.commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            transaction.rollback();
//        }

        // Delete record from database.
        try{
            User user = session.get(User.class, 2L);
            session.delete(user);
            transaction.commit();

        } catch (Exception e) {
            transaction.rollback();
            throw new RuntimeException(e);
        }

        session.close();
    }
}

