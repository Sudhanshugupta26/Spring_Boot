package in.gupta.main.springbootdatajpa.repository;

import in.gupta.main.springbootdatajpa.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {

}
