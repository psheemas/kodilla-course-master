package com.kodilla.good.patterns.food2door;

public class Food2Door {
    public void food2Door() {
        System.out.println("Hello in Frajsko");
        System.out.println("Please choose Your Favorite Producer");
        UserInput userInput = new UserInput();
        ProducentsInterface selectedProducer = userInput.OptionsScreen();
        System.out.println("Here is the List of available products for " + selectedProducer.companyName());
        System.out.println("Please choose what You want to order and contact with us: " + selectedProducer.contact());
        System.out.println(selectedProducer.orderList());
        selectedProducer.process();
    }
}
