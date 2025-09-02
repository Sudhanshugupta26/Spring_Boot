package in.gupta.main;



import jakarta.servlet.http.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
}