package in.gupta.main.services;

import in.gupta.main.entities.User;
import in.gupta.main.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public User updateUser(int id,User newUser) {
        User user1 = userRepository.findById(id).orElse(null);
        if (user1 != null){
            userRepository.save(newUser);
            return newUser;
        }
        else{
            throw new RuntimeException("User not found with id: "+id);
        }
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}
