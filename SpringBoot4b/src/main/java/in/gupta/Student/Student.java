package in.gupta.Student;

public class Student {
    private String name;
    private int rno;
    private Address address;

    public Student(String name, int rno, Address address) {
        this.name = name;
        this.rno = rno;
        this.address = address;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rno);
        System.out.println("Address: " + address);
    }
}
