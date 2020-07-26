package com.example.Meritus.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculatorController {
    

    @GetMapping("/")
    public String showCalculator(Model model){
        model.addAttribute("calculator", new Calculator());
        return "calculate";
    }

    @PostMapping("/")
    public String doCalculation(@ModelAttribute("calculator") Calculator calculator){
        return "result";
    }
}
