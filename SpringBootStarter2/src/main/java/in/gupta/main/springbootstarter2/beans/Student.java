package in.gupta.main.springbootstarter2.beans;

public class Student {
    private String name;
    private int age;
    private String course;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    public void display() {
        System.out.println("Name: "+name+", Age: "+age+", Course: "+course);
    }
}
