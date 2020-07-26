package com.example.Meritus.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Simple Controller for the Calculator Application
 */
@Controller
public class CalculatorController {


    /**
     * Displays calculation page
     * @param model - provided by Spring, model of data
     * @return - jsp page 'calculate.jsp'
     */
    @GetMapping("/")
    public String showCalculator(Model model){
        model.addAttribute("calculator", new Calculator());
        return "calculate";
    }

    /**
     * Displays calculation result page if validation has passed
     * @param calculator - provided in the showCalculator method to Spring
     * @param bindingResult - provided in Spring
     * @return - depending on errors
     *          no errors - result.jsp
     *          errors - calculate.jsp
     */
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
