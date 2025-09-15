package in.gupta.main.springboothibernate;

import in.gupta.main.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.hibernate.cfg.Configuration;


@SpringBootApplication
public class SpringBootHibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHibernateApplication.class, args);

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
//        Transaction transaction = session.beginTransaction(); // There is no need of this if only read operation.

        User user = session.get(User.class, 1L);
        System.out.println(user.getCity()+" "+user.getName()+" "+user.getEmail()+" "+user.getPassword()+" "+user.getGender()+" .");
    }

}
