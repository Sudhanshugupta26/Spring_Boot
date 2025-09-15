package in.gupta.main.springbootdatajpa;

import in.gupta.main.springbootdatajpa.entities.Student;
import in.gupta.main.springbootdatajpa.service.StudentServices;
import in.gupta.main.springbootdatajpa.service.StudentServicesImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDataJpaApplication {

	public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootDataJpaApplication.class, args);
        context.getBean(StudentServicesImpl.class);

        // Insertion of Student
//        Student std = new Student();
//        std.setName("Tushar");
//        std.setAge(18);
//        std.setMarks("A");
//        StudentServices stdService = context.getBean(StudentServicesImpl.class);
//        boolean status = stdService.addStudent(std);
//        if (status){
//            System.out.println("Student added successfully");
//        }else{
//            System.out.println("Student not added");
//        }

        // Get All Students
//        StudentServices stdService = context.getBean(StudentServicesImpl.class);
//        stdService.getAllStudents().forEach(std -> System.out.println(std.getName()));

        // Get Student by Id
//        StudentServices stdService = context.getBean(StudentServicesImpl.class);
//        Student std = stdService.getStudentById(3l);
//        System.out.println(std.getName());

        // Update Student
//        StudentServices stdService = context.getBean(StudentServicesImpl.class);
//        boolean status = stdService.updateStudent(2l, "B");
//        if (status){
//            System.out.println("Student updated successfully");
//        }else{
//            System.out.println("Student not updated");
//        }

        // Delete Student
        StudentServices stdService = context.getBean(StudentServicesImpl.class);
        if (stdService.deleteStudent(2l)) {
            System.out.println("Student deleted successfully");
        }else
        {
            System.out.println("Student not deleted");
        }
    }
}

