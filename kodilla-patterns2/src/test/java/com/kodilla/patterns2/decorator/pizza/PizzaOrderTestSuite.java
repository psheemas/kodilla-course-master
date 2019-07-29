package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testOrderMargerita(){
        //Given
        PizzaBase pizzaBase = new PizzaMargerita();
        //When
        BigDecimal calculatePrice = pizzaBase.getPrice();
        //Then
        assertEquals(new BigDecimal(15),calculatePrice);
    }

    @Test
    public void testOrderHotChili(){
        //Given
        PizzaBase pizzaBase = new PizzaMargerita();
        pizzaBase = new PizzaHotChili(pizzaBase);
        //When
        BigDecimal calculatePrice = pizzaBase.getPrice();
        System.out.println(pizzaBase.getCondiments());
        //Then
        assertEquals(new BigDecimal(20),calculatePrice);
    }

    @Test
    public void testOrderPepperoni(){
        //Given
        PizzaBase pizzaBase = new PizzaMargerita();
        pizzaBase = new PizzaPepperoni(pizzaBase);
        //When
        BigDecimal calculatePrice = pizzaBase.getPrice();
        System.out.println(pizzaBase.getCondiments());
        //Then
        assertEquals(new BigDecimal(25),calculatePrice);
    }

    @Test
    public void testOrderMargeritaPlusBaconAndExtraCheese(){
        //Given
        PizzaBase pizzaBase = new PizzaMargerita();
        pizzaBase = new PizzaExtraBacon(pizzaBase);
        pizzaBase = new PizzaExtraCheese(pizzaBase);
        //When
        BigDecimal calculatePrice = pizzaBase.getPrice();
        System.out.println(pizzaBase.getCondiments());
        //Then
        assertEquals(new BigDecimal(21),calculatePrice);
    }
}
