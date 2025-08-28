package in.gupta.springboot6b;

import in.gupta.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringBoot6bApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot6bApplication.class, args);
        ApplicationContext context = new ClassPathXmlApplicationContext("appconfig.xml");
        Student student = context.getBean(Student.class);
        student.display();
    }

}
