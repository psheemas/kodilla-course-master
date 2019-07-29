package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaMargerita implements PizzaBase {

    @Override
    public BigDecimal getPrice(){
        return new BigDecimal(15.00);
    }

    @Override
    public String getCondiments(){
        return "Crispy dough with tomato sauce";
    }
}
