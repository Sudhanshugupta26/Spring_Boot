package in.gupta.config;

import in.gupta.student.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigFile {
    @Bean("stdObj1")
    public Student createStdBeanObj1() {
        Student std = new Student();
        std.setName("Sudhanshu Gupta");
        std.setRno(29);
        std.setEmail("guptasudhanshukumar1@gmail.com");
        return std;
    }

    @Bean("stdObj2")
    public Student createStdBeanObj2() {
        Student std = new Student();
        std.setName("Tushar Gupta");
        std.setRno(31);
        std.setEmail("guptatusharkumar1@gmail.com");
        return std;
    }
}