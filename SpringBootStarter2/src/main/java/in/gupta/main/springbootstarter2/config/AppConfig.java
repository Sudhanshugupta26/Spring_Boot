package in.gupta.main.springbootstarter2.config;

import in.gupta.main.springbootstarter2.beans.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public CommandLineRunner runner(){
        return new CommandLineRunner(){
            @Override
            public void run(String... args) throws Exception {
                System.out.println("Students are:");
                std1().display();
                std2().display();
            }
        };
    }

    @Bean
    public Student std1(){
        Student std = new Student();
        std.setName("Gaurav");
        std.setAge(20);
        std.setCourse("BCA");
        return std;
    }

    @Bean
    public Student std2(){
        Student std = new Student();
        std.setName("Raj");
        std.setAge(22);
        std.setCourse("BCA");
        return std;
    }
}
