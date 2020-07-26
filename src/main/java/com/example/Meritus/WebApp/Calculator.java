package com.example.Meritus.WebApp;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;

/**
 * JB which provides a service to the client
 */
public class Calculator {

    //Parameter responsible for first input from the form; with validation
    @NotNull
    @Range(min = -1073741823, max = 1073741823)
    private Long first;

    //Parameter responsible for second input from the form; with validation
    @NotNull
    @Range(min = -1073741823, max = 1073741823)
    private Long second;

    /**
     * returns the sum of numbers provided by user
     * @return - sum of numbers
     */
    public Long add(){
        if(first!=null && second != null)
            return first+second;
        else
            return null;
    }


    //Getter
    public Long getFirst() {
        return first;
    }

    //Setter
    public void setFirst(Long first) {
        this.first = first;
    }

    //Getter
    public Long getSecond() {
        return second;
    }

    //Setter
    public void setSecond(Long second) {
        this.second = second;
    }

}
