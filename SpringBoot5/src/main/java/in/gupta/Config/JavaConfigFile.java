package in.gupta.config;

import in.gupta.Student.Address;
import in.gupta.Student.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class JavaConfigFile {
    public Address settingAddress() {
        Address address = new Address();
        address.setHouseNo(123);
        address.setCity("Bangalore");
        address.setPincode(560001);
        return address;
    }

    @Bean
    public Student student() {
        Student student = new Student();
        student.setName("Sudhanshu");
        student.setRno(29);
        student.setAddress(settingAddress());   // Setter based DI
        return student;
    }
}
