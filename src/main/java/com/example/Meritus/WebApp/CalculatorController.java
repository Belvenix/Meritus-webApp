package com.example.Meritus.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class CalculatorController {


    @GetMapping("/")
    public String showCalculator(Model model){
        model.addAttribute("calculator", new Calculator());
        return "calculate";
    }

    @PostMapping("/")
    public String doCalculation(@Valid @ModelAttribute("calculator") Calculator calculator,
                                BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "calculate";
        }
        else{
            return "result";
        }

    }
}
