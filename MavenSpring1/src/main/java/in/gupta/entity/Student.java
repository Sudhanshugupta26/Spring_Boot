package in.gupta.entity;

public class Student {
    private String name;
    private int age;
    private float marks;

    public void setMarks(float marks) {
        this.marks = marks;
    }
    public float getMarks() {
        return marks;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Name: "+name+" Age: "+age+" Marks: "+marks);
    }
}
