package com.kodilla.good.patterns.food2door;

import java.util.HashSet;

public class HealthyShop implements ProducentsInterface {
    private String companyName;
    private String website;

    public HashSet<VegetablesAndFruits> getAvailableItems(){

        VegetablesAndFruits potatoes = new VegetablesAndFruits(5, "Ziemniaki");
        VegetablesAndFruits cucumbers = new VegetablesAndFruits(7, "Ogórki");
        VegetablesAndFruits broccoli = new VegetablesAndFruits(9, "Brokuły");
        VegetablesAndFruits apples = new VegetablesAndFruits(12, "Jabłka");
        VegetablesAndFruits peaches = new VegetablesAndFruits(12, "Brzoskwinie");

        HashSet<VegetablesAndFruits> availVegFrui = new HashSet<VegetablesAndFruits>();
        availVegFrui.add(potatoes);
        availVegFrui.add(cucumbers);
        availVegFrui.add(broccoli);
        availVegFrui.add(apples);
        availVegFrui.add(peaches);
        return availVegFrui;
    }

    @Override
    public void process() {
        System.out.println("Thank You for choosing ExtraFoodShop, we are almost ready to prepare Your order");
    }
    @Override
    public String companyName() {
        return this.companyName="HealthyShop";
    }

    @Override
    public HashSet<VegetablesAndFruits> orderList() {
        return getAvailableItems();
    }

    @Override
    public String contact() {
        System.out.println("Please visit our website and place and order there.");
        return this.website = "www.Heathyshop.com";
    }
}
