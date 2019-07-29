package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaPepperoni extends AbstractPizzaDecorator {
    public PizzaPepperoni(PizzaBase pizzaBase){
        super(pizzaBase);
    }

    @Override
    public BigDecimal getPrice(){
        return super.getPrice().add(new BigDecimal(10));
    }

    @Override
    public String getCondiments(){
        return super.getCondiments() + " + extra salami";
    }
}
