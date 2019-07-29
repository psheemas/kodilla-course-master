package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaHotChili extends AbstractPizzaDecorator{
    public PizzaHotChili(PizzaBase pizzaBase){
        super(pizzaBase);
    }

    @Override
    public BigDecimal getPrice(){
        return super.getPrice().add(new BigDecimal(5));
    }

    @Override
    public String getCondiments(){
        return super.getCondiments() + " + jalapeno peppers";
    }
}
