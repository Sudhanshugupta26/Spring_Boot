package in.gupta.main.springbootwebapp1.services;

import in.gupta.main.springbootwebapp1.entities.User;
import in.gupta.main.springbootwebapp1.repositiories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserImpl implements UserService{

    @Autowired
    private UserRepository repository;

    @Override
    public boolean saveUser(in.gupta.main.springbootwebapp1.entities.User user) {
        boolean status = false;
        try {
            repository.save(user);
            status = true;
        } catch (Exception e) {
            status = false;
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public User login(String email, String password){
        User validUser = repository.findByEmail(email);
        if(validUser != null && validUser.getPassword().equals(password)){
            return validUser;
        }else{
            return null;
        }
    }
}
