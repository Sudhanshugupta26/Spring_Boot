package in.gupta.springboot2;

import in.gupta.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = "in.gupta") // scans config and student packages
public class SpringBoot2Application {

    public static void main(String[] args) {
        // Start Spring Boot and get the main context
        ApplicationContext context = SpringApplication.run(SpringBoot2Application.class, args);

        // Retrieve both Student beans from the Boot-managed context
        Student std1 = (Student) context.getBean("stdObj1");
        std1.display();

        Student std2 = (Student) context.getBean("stdObj2");
        std2.display();
    }
}