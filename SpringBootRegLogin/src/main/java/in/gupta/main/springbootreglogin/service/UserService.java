package in.gupta.main.springbootreglogin.service;

import in.gupta.main.springbootreglogin.entities.User;

public interface UserService {
    public boolean register(User user);
    public User validateUser(String email,String password);
}
