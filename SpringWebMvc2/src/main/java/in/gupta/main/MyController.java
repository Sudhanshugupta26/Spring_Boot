package in.gupta.main;


import in.gupta.bean.User;
import jakarta.servlet.http.HttpServlet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController extends HttpServlet {
    @GetMapping("/helloPage")
    public ModelAndView openHelloPage(){
        System.out.println("Hello Page Opened");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        return modelAndView;
    }

    @RequestMapping("/aboutUsPage")
    public String openAboutUsPage(){ // String because now we are not dealing with data.
        System.out.println("About Us Page Opened");
        return "aboutUs";
    }

    @RequestMapping("/formPage")
    public String openFormPage(){
        System.out.println("Form Page Opened");
        return "my-form";
    }

//    @PostMapping("/my-form")
//    public String handleForm(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("phone") String phone, Model model){
//        User user = new User();
//        user.setName(name);
//        user.setEmail(email);
//        user.setPhone(phone);
//        model.addAttribute("model_user", user);
//        return "profile";
//    }

    @PostMapping("/my-form")
    public String handleForm(@ModelAttribute("model_user") User user){ // Only if the attribute name of jsp is same as User class.
        System.out.println("Name: " + user.getName());
        return "profile";
    }
}