package in.gupta.main.springbootstarterjdbccrud;

import in.gupta.main.springbootstarterjdbccrud.dao.UserDAO;
import in.gupta.main.springbootstarterjdbccrud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootStarterJdbcCrudApplication implements CommandLineRunner {

    @Autowired
    private UserDAO userDAO;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStarterJdbcCrudApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //Insetrion of User
//        User user = new User();
//        user.setName("Sudhanshu");
//        user.setEmail("guptasudhanshukumar1@gmail.com");
//        user.setCity("Lucknow");
//        user.setGender("Male");
//
//        boolean result = userDAO.insertUser(user);
//        if (result) {
//            System.out.println("User inserted: " + result);
//        }
//        else {
//            System.out.println("User inserted: " + result);
//        }

        //Update User
//        User user = new User();
//        user.setName("Sudhanshu Gupta");
//        user.setEmail("guptasudhanshukumar1@gmail.com");
//        user.setCity("Lucknow");
//        user.setGender("Male");
//        boolean result = userDAO.updateUser(user);
//        if (result){
//            System.out.println("User updated: "+result);
//        }
//        else{
//            System.out.println("User updated: "+result);
//        }

        //Delete User
//        boolean result = userDAO.deleteUser("guptasudhanshukumar1@gmail.com");
//        if (result){
//            System.out.println("User deleted: "+result);
//        }
//        else{
//            System.out.println("User deleted: "+result);
//        }

//        //Get One User
//        User user = userDAO.getUserByEmail("guptasudhanshukumar1@gmail.com");
//        System.out.println("Name: "+user.getName()+", Email: "+user.getEmail()+", City: "+user.getCity()+", Gender: "+user.getGender()+".");

            //Get All Users
            for (User user : userDAO.getALlUsers()) {
            System.out.println("Name: "+user.getName()+", Email: "+user.getEmail()+", City: "+user.getCity()+", Gender: "+user.getGender()+".");
        }
    }
}
