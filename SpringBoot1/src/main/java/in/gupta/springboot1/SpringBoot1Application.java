package in.gupta.springboot1;

import in.gupta.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringBoot1Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringBoot1Application.class, args);

        String config_loc = "appContext.xml";   // application context location.
        ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);        // To Start Spring container.

        Student student1 = (Student) context.getBean("stdId");   // Since spring itself creates container so, we just have to call this. And we typecasted it because it returns it as a string.
        student1.display();                   // stdId is id defined in appContext.xml

        System.out.println("-------------------------------");

        Student student2 = (Student) context.getBean("stdId2");
        student2.display();
    }
}
