package com.kodilla.good.patterns.food2door;

import java.util.HashSet;

public class GlutenFreeShop implements ProducentsInterface{
    private String companyName;
    private String companyMail;

    public HashSet<VegetablesAndFruits> getAvailableItems(){

        VegetablesAndFruits potatoes = new VegetablesAndFruits(5, "Ziemniaki");
        VegetablesAndFruits peaches = new VegetablesAndFruits(8, "Brzoskwinie");
        VegetablesAndFruits strawberries = new VegetablesAndFruits(10, "Truskawki");
        VegetablesAndFruits grapes = new VegetablesAndFruits(9, "Winogrona");

        HashSet<VegetablesAndFruits> availVegFrui = new HashSet<VegetablesAndFruits>();
        availVegFrui.add(potatoes);
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
        return this.companyName="GlutenFreeShop";
    }

    @Override
    public HashSet<VegetablesAndFruits> orderList() {
        return getAvailableItems();
    }

    @Override
    public String contact() {
        return this.companyMail="glutenFreeShop@yahooo.com";
    }
}
