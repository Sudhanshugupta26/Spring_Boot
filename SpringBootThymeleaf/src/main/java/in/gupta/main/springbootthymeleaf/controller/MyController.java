package in.gupta.main.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MyController {
    @GetMapping("myProfile")
    public String hello(Model model) {
        String name = "Sudhanshu Gupta";
        model.addAttribute("name", name);
        return "profile";
    }
    @GetMapping("myConditional")
    public String conditional(Model model) {
        int num1 = 10,num2 = 20;
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        return "conditional";
    }

    @GetMapping("myLoop")
    public String loop(Model model) {
        List<Integer> list = List.of(1,2,3,4,5);
        model.addAttribute("list", list);
        return "loop";
    }
}
