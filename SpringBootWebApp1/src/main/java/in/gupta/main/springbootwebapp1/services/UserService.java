package in.gupta.main.springbootwebapp1.services;

import in.gupta.main.springbootwebapp1.entities.User;

public interface UserService {
    public boolean saveUser(User user);
    public User login(String email, String password);
}
