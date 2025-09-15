package in.gupta.main.springbootreglogin.repository;

import in.gupta.main.springbootreglogin.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByEmail(String email);
}
