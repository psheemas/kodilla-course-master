package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaExtraBacon extends AbstractPizzaDecorator{
    public PizzaExtraBacon(PizzaBase pizzaBase){
        super(pizzaBase);
    }

    @Override
    public BigDecimal getPrice(){
        return super.getPrice().add(new BigDecimal(3));
    }

    @Override
    public String getCondiments(){
        return super.getCondiments() + " + extra bacon";
    }
}
