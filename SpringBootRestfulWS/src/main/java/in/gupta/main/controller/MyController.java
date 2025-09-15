package in.gupta.main.controller;

import in.gupta.main.entities.User;
import in.gupta.main.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController// It combines @Controller and @ResponseBody
// @ResponseBody is used to return the response as plain text and not as a view page

public class MyController {

    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/user")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id){
        User user = userService.getUserById(id).orElse(null);
        if (user != null) {
            return ResponseEntity.ok().body(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<User> updateUser(@PathVariable int id, @RequestBody User newUser){
        User updatedUser = userService.updateUser(id,newUser);
        if (updatedUser != null){
            return ResponseEntity.ok().body(updatedUser);
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id){
        if (getUserById(id)!=null){
            User user = getUserById(id).getBody();
            userService.deleteUser(id);
            return ResponseEntity.ok().body("User "+user.getName()+" with email "+user.getEmail()+" deleted successfully");
        }else{
            return ResponseEntity.notFound().build();
        }
    }
}
