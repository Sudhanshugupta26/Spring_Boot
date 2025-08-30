package in.gupta.main;


import in.gupta.resources.JavaConfigFile;
import in.gupta.rowMappers.StudentRowmapper;
import in.gupta.student.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;


public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigFile.class);
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");

        // Insertion of record.
//        int rno=102;
//        String name="Tushar";
//        int marks=95;
//        String sql_query = "insert into student values(?,?,?)"; // query to insert a record.
//        int count = jdbcTemplate.update(sql_query,rno,name,marks); // updating the record using JdbcTemplate and update method.
//        // order of the parameters in the query is important.
//        if(count>0){
//            System.out.println("Record inserted successfully");
//        }else{
//            System.out.println("Record not inserted");
//        }

        // Update of record.
//        int rno=102;
//        int marks=96;
//        String sql_query = "update student set std_marks=? where std_roll=?"; // query to update a record.
//        int count = jdbcTemplate.update(sql_query,marks,rno); // updating the record using JdbcTemplate and update method.
//        if(count>0){
//            System.out.println("Record updated successfully");
//        }
//        else{
//            System.out.println("Record not updated");
//        }

        //Deletion of record.
//        int rno=102;
//        String sql_query = "delete from student where std_roll=?"; // query to delete a record.
//        int count = jdbcTemplate.update(sql_query,rno); // updating the record using JdbcTemplate and update method.
//        if(count>0){
//            System.out.println("Record deleted successfully");
//        }
//        else{
//            System.out.println("Record not deleted");
//        }

        // Selection of all record.
//        String sql_query = "select * from student"; // query to select all records.
//        List<Student> list_of_student = jdbcTemplate.query(sql_query,new StudentRowmapper()); // Overriding the RowMapper's mapRow method.
//        for(Student student : list_of_student){
//            System.out.println("Roll No: "+student.getRollNo()+", Name: "+student.getName()+", Marks: "+student.getMarks());
//        }

        // Selection of a particular record.
        int rno=102;
        String sql_query = "select * from student where std_roll=?"; // query to select a particular record.
        Student student = jdbcTemplate.queryForObject(sql_query, new StudentRowmapper(), rno); // Overriding the RowMapper's mapRow method.
        System.out.println("Roll No: "+student.getRollNo()+", Name: "+student.getName()+", Marks: "+student.getMarks());
    }
}
