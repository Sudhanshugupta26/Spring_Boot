package in.gupta.main.springbootdatajpa.service;

import in.gupta.main.springbootdatajpa.entities.Student;

import java.util.List;

public interface StudentServices {
    public boolean addStudent(Student student);
    public List<Student> getAllStudents();
    public Student getStudentById(long id);
    public boolean updateStudent(long id, String marks);
    public boolean deleteStudent(long id);
}
