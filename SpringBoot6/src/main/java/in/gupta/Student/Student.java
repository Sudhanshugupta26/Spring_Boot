package in.gupta.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
    private String name;
    private int rno;

    @Autowired                      // Autowiring directly with bean
    @Qualifier("settingAddress2")   // Defing which bean to choose.
    private Address address;

    public Student(String name, int rno) {
        this.name = name;
        this.rno = rno;
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rno);
        System.out.println("Address: " + address);
    }
}
