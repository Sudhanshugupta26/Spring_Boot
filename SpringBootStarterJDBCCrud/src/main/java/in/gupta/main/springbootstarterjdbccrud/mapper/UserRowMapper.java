package in.gupta.main.springbootstarterjdbccrud.mapper;

import in.gupta.main.springbootstarterjdbccrud.entity.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setName(rs.getString("name"));
        user.setEmail(rs.getString("email"));
        user.setCity(rs.getString("city"));
        user.setGender(rs.getString("gender"));
        return user;
    }
}
