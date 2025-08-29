package in.gupta.main;

import in.gupta.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        String configFile = "appContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(configFile);
        Student student = (Student) context.getBean("student");
        student.display();
    }
}
