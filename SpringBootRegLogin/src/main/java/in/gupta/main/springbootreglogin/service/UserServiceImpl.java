package in.gupta.main.springbootreglogin.service;

import in.gupta.main.springbootreglogin.entities.User;
import in.gupta.main.springbootreglogin.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public boolean register(User user) {
        try {
            userRepo.save(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public User validateUser(String email, String password){
        User user = userRepo.findByEmail(email);
        if(user != null && user.getPassword().equals(password)){
            return user;
        }
        return null;
    }
}
