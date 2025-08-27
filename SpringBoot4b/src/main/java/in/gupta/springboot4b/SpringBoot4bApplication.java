package in.gupta.springboot4b;

import in.gupta.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringBoot4bApplication {

    public static void main(String[] args){
        SpringApplication.run(SpringBoot4bApplication.class, args);

        String config_loc = "appContext.xml";   // application context location.
        ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);

        Student std = (Student) context.getBean("std");
        std.display();
    }
}
