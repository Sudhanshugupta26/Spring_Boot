package in.gupta.main.springbootdatajpa.service;

import in.gupta.main.springbootdatajpa.entities.Student;
import in.gupta.main.springbootdatajpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServicesImpl implements StudentServices{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public boolean addStudent(Student student){
        boolean status = false;
        try{
            studentRepository.save(student);
            status = true;
        }catch (Exception e){
            status = false;
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(long id){
        return studentRepository.findById(id).get();
    }

    @Override
    public boolean updateStudent(long id, String marks){
        Student student = getStudentById(id);
        student.setMarks(marks);
        boolean status = false;
        try{
            studentRepository.save(student);
            status = true;
        }catch (Exception e){
            status = false;
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public boolean deleteStudent(long id){
        boolean status = false;
        try{
            studentRepository.deleteById(id);
            status = true;
        }catch (Exception e){
            status = false;
            e.printStackTrace();
        }
        return status;
    }
}
