package in.gupta.main.springbootwebapp1.controller;

import in.gupta.main.springbootwebapp1.entities.User;
import in.gupta.main.springbootwebapp1.services.UserImpl;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
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
    private UserImpl userImpl;

    @GetMapping("/regiPage")
    public String openRegistrationPage(Model model){
        model.addAttribute("user", new User());
        return "register";
    }
    @PostMapping("/register")
    public String submitRegistration(@ModelAttribute("user") User user, Model model){
        boolean status = userImpl.saveUser(user);
        if(status){
            model.addAttribute("Smessage", "User Registered Successfully");
            return "register";
        }else{
            model.addAttribute("Emessage", "User Registration Failed");
            return "register";
    }}
    @GetMapping("/loginPage")
    public String getLoginPage(Model model){
        model.addAttribute("user", new User());
        return  "login";
    }

    @PostMapping("/loginForm")
    public String submitLogin(@ModelAttribute("user")User user, Model model){
        User validUser = userImpl.login(user.getEmail(),  user.getPassword());
        if (validUser != null){
            model.addAttribute("Smessage", "User Logged In Successfully");
            model.addAttribute("userName", validUser.getName());
            return "profile";
        }else{
            model.addAttribute("Emessage", "User Credentials Didn't Matched");
            return "login";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request){
        HttpSession session = request.getSession(false);
        if(session != null){
            session.invalidate();
        }
        return "redirect:/loginPage";
    }
}
