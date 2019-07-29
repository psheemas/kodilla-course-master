package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaExtraCheese extends AbstractPizzaDecorator{
    public PizzaExtraCheese(PizzaBase pizzaBase){
        super(pizzaBase);
    }

    @Override
    public BigDecimal getPrice(){
        return super.getPrice().add(new BigDecimal(3));
    }

    @Override
    public String getCondiments(){
        return super.getCondiments() + " + extra cheese";
    }
}
