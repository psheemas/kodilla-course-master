package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public abstract class AbstractPizzaDecorator implements PizzaBase {
    private final PizzaBase pizzaBase;

    protected AbstractPizzaDecorator(PizzaBase pizzaBase) {
        this.pizzaBase = pizzaBase;
    }

    @Override
    public BigDecimal getPrice() {
        return pizzaBase.getPrice();
    }

    @Override
    public String getCondiments(){
        return pizzaBase.getCondiments();
    }
}
