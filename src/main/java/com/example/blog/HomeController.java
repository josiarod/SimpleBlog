package com.example.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/javabootcamp")
    public String javabootcamp() {
        return "javabootcamp";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    @RequestMapping("/contact")
    public String contact() {
        return "contact";
    }
    @RequestMapping("/post1")
    public String post1() {
        return "post1";
    }
    @RequestMapping("/post2")
    public String post2() {
        return "post2";
    }
    @RequestMapping("/post3")
    public String post3() {
        return "post3";
    }
    @RequestMapping("/post4")
    public String post4() {
        return "post4";
    }
    @RequestMapping("/post5")
    public String post5() {
        return "post5";
    }

    @RequestMapping("/post6")
    public String post6() {
        return "post6";
    }
}
