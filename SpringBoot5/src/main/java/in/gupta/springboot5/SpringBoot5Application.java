package in.gupta.springboot5;

import in.gupta.Student.Address;
import in.gupta.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = "in.gupta")
public class SpringBoot5Application {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringBoot5Application.class, args);
        Student student = context.getBean(Student.class);
        student.display();
    }

}
