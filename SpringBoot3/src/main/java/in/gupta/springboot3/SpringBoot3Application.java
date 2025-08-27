package in.gupta.springboot3;

import in.gupta.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = "in.gupta")
public class SpringBoot3Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBoot3Application.class, args);
        Student student = context.getBean(Student.class);
        student.display();
    }

}
