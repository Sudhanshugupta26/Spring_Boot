package in.gupta.config;

import in.gupta.Student.Address;
import in.gupta.Student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigFile {

    @Bean
    public Address settingAddress1() {
        Address address = new Address(811,"Lucknow",226094);
        return address;
    }

    @Bean
    public Address settingAddress2() {
        Address address = new Address(213,"Gorakhpur",222094);
        return address;
    }

    @Bean
    public Student student() {
        Student student = new Student("Sudhanshu", 101);  // Constructor based DI
        return student;
    }
}
