package com.example.Meritus.WebApp;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.*;

public class Calculator {

    @NotNull
    @Range(min = -1073741823, max = 1073741823)
    private Long first;

    @NotNull
    @Range(min = -1073741823, max = 1073741823)
    private Long second;

    public Long add(){
        if(first!=null && second != null)
            return first+second;
        else
            return null;
    }

    public Long getFirst() {
        return first;
    }

    public void setFirst(Long first) {
        this.first = first;
    }

    public Long getSecond() {
        return second;
    }

    public void setSecond(Long second) {
        this.second = second;
    }

}
