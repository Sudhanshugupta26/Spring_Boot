package in.gupta.main.springbootstarter1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @GetMapping("/")
    @ResponseBody
    public String MyController() {
        return "Hello Sudhanshu!";
    }
}
