package in.gupta.Student;

public class Student {
    private String name;
    private int rno;
    private Address address;

    public void setName(String name) {
        this.name = name;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rno);
        System.out.println("Address: " + address);
    }
}
