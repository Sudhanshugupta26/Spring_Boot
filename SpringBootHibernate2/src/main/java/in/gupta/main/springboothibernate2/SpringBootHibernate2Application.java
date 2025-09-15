package in.gupta.main.springboothibernate2;

import in.gupta.main.entities.User;
import in.gupta.main.repository.DBOperation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = {"in.gupta.main"})
public class SpringBootHibernate2Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootHibernate2Application.class, args);

        DBOperation dbops = context.getBean(DBOperation.class);
        User user = dbops.getUserById(1L);

        System.out.println(user.getCity()+" "+user.getName()+" "+user.getEmail()+" "+user.getPassword()+" "+user.getGender());
    }

}
