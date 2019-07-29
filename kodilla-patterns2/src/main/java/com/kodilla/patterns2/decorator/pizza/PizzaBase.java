package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public interface PizzaBase {
    BigDecimal getPrice();
    String getCondiments();
}
