package in.gupta.main.springbootreglogin.controller;

import in.gupta.main.springbootreglogin.entities.User;
import in.gupta.main.springbootreglogin.service.UserServiceImpl;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("user",new User());
        return "register";
    }

    @PostMapping("/regiForm")
    public String registerUser(@ModelAttribute("user") User user, Model model) {
        boolean status = userService.register(user);
        if (status) {
            model.addAttribute("message", "User Registered Successfully");
        }else{
            model.addAttribute("Emessage", "User Registration Failed");
        }
        return "register";
    }

    @GetMapping("login")
    public String login(Model model){
        model.addAttribute("user",new User());
        return "login";
    }

    @PostMapping("/loginForm")
    public String submitLogin(@ModelAttribute("user") User user, Model model){
        User user1 = userService.validateUser(user.getEmail(),user.getPassword());
        if(user1 != null){
            model.addAttribute("userName",user1.getName());
            return "profile";
        }else{
            model.addAttribute("Emessage", "Login Failed");
            return "login";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request, Model model){
        HttpSession session = request.getSession(false);
        if(session != null){
            session.invalidate();
        }
        model.addAttribute("message", "Logout Successful");
        model.addAttribute("user",new User());
        return "login";
    }
}
