package in.gupta.main.springbootstarterjdbccrud.dao;

import in.gupta.main.springbootstarterjdbccrud.entity.User;
import in.gupta.main.springbootstarterjdbccrud.mapper.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public boolean insertUser(User user) {
        boolean result = false;
        try {
            String sql = "insert into user(name,email,city,gender) values(?,?,?,?)";
            int count=jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getCity(), user.getGender());
            if(count>0) {
                result = true;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            result=false;
        }
        return result;
    }

    public boolean updateUser(User user){
        boolean result = false;
        try {
            String sql = "update user set name=?,city=?,gender=? where email=?";
            int count=jdbcTemplate.update(sql, user.getName(), user.getCity(), user.getGender(), user.getEmail());
            if(count>0) {
                result = true;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            result=false;
        }
        return result;
    }

    public boolean deleteUser(String email){
        boolean result = false;
        try {
            String sql = "delete from user where email=?";
            int count=jdbcTemplate.update(sql,email);
            if(count>0) {
                result = true;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            result=false;
        }
        return result;
    }

    public User getUserByEmail(String email){
        String sql = "select * from user where email=?";
        return jdbcTemplate.queryForObject(sql,new UserRowMapper(),email);
    }

    public List<User> getALlUsers(){
        String sql = "select * from user";
        return jdbcTemplate.query(sql, new UserRowMapper());
    }
}
