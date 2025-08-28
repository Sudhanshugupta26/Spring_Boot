package in.gupta.springboot6;

import in.gupta.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = "in.gupta")
public class SpringBoot6Application {

    public static void main(String[] args) {

            ApplicationContext context = SpringApplication.run(SpringBoot6Application.class, args);
            Student student = context.getBean(Student.class);
            student.display();
    }

}
