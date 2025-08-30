package in.gupta.main;

import in.gupta.resources.JavaConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.Map;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigFile.class);
        NamedParameterJdbcTemplate namedParameterJdbcTemplate = context.getBean(NamedParameterJdbcTemplate.class);
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("key_roll",103);
        paramMap.put("key_name","Rahul");
        paramMap.put("key_marks",90);
        String sql = "insert into student values(:key_roll,:key_name,:key_marks)";  // Don't have to use ? and directly provide the values in keys reference of the map.
        int count = namedParameterJdbcTemplate.update(sql,paramMap);    // inserting the record.
        if (count>0){
            System.out.println("Record inserted successfully");
        }
        else{
            System.out.println("Record not inserted");
        }

    }
}
