package in.gupta.rowMappers;

import in.gupta.student.Student;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowmapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setName(rs.getString("std_name"));  //using methods of ResultSet class to get the values from database and store them in a variable of Student class.
        student.setMarks(rs.getInt("std_marks"));   //using methods of ResultSet class to get the values from database and store them in a variable of Student class.
        student.setRollNo(rs.getInt("std_roll"));   //using methods of ResultSet class to get the values from database and store them in a variable of Student class.
        return student;
    }
}
