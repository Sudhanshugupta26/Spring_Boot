package in.gupta.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JavaConfigFile {
    @Bean
    public DriverManagerDataSource dataSource() {
        //DriverManagerDataSource object used to connect to the database.
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        //Connection details.
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring_jdbc_db"); // specifying the database name to be used.
        dataSource.setUsername("root");
        dataSource.setPassword("{Password}");

        return dataSource;
    }

    @Bean
    public NamedParameterJdbcTemplate namedParameterJdbcTemplate() {
        return new NamedParameterJdbcTemplate(dataSource()); // creating a NamedParameterJdbcTemplate object.
    }
}
