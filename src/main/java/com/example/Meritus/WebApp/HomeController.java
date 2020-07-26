package com.example.Meritus.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    /**
     * Loads the index page
     * @return
     */
    @GetMapping(value="/")
    public String homePage(){
        return "index";
    }
}
