package com.kodilla.good.patterns.food2door;

import java.util.HashSet;

public class ExtraFoodShop implements ProducentsInterface {
    private String companyName;
    private String companyPhone;

    public HashSet<VegetablesAndFruits> getAvailableItems(){

        VegetablesAndFruits potatoes = new VegetablesAndFruits(5, "Ziemniaki");
        VegetablesAndFruits tomatoes = new VegetablesAndFruits(3, "Pomidory");
        VegetablesAndFruits cucumbers = new VegetablesAndFruits(17, "Ogórki");
        VegetablesAndFruits broccoli = new VegetablesAndFruits(30, "Brokuły");
        VegetablesAndFruits apples = new VegetablesAndFruits(82, "Jabłka");
        VegetablesAndFruits peaches = new VegetablesAndFruits(2, "Brzoskwinie");
        VegetablesAndFruits strawberries = new VegetablesAndFruits(1, "Truskawki");
        VegetablesAndFruits grapes = new VegetablesAndFruits(16, "Winogrona");

        HashSet<VegetablesAndFruits> availVegFrui = new HashSet<VegetablesAndFruits>();
        availVegFrui.add(potatoes);
        availVegFrui.add(tomatoes);
        availVegFrui.add(cucumbers);
        availVegFrui.add(broccoli);
        availVegFrui.add(apples);
        availVegFrui.add(peaches);
        availVegFrui.add(strawberries);
        availVegFrui.add(grapes);
        return availVegFrui;
    }

    @Override
    public void process() {
        System.out.println("Thank You for choosing ExtraFoodShop, we are almost ready to prepare Your order");
    }

    @Override
    public String companyName() {
        return this.companyName="ExtraFoodShop";
    }

    @Override
    public HashSet<VegetablesAndFruits> orderList() {
        return getAvailableItems();
    }

    @Override
    public String contact() {
        return this.companyPhone="2550649816";
    }
}
