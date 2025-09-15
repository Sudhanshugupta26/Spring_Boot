package in.gupta.main.services;

import in.gupta.main.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public User addUser(User user);
    public List<User> getAllUsers();
    public Optional<User> getUserById(int id);
    public User updateUser(int id,User user);
    public void deleteUser(int id);
}
