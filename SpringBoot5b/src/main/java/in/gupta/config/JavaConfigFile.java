package in.gupta.config;

import in.gupta.Student.Address;
import in.gupta.Student.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigFile {
    public Address settingAddress() {
        Address address = new Address(811,"Lucknow",226094);
        return address;
    }

    @Bean
    public Student student() {
        Student student = new Student("Sudhanshu", 101, settingAddress());  // Constructor based DI
        return student;
    }
}
