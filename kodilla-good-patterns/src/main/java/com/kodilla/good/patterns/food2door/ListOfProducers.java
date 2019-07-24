package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;

public class ListOfProducers {
    public ArrayList<ProducentsInterface> producentsList(){
        ArrayList<ProducentsInterface> theList = new ArrayList<>();
        theList.add(0,new ExtraFoodShop());
        theList.add(1,new GlutenFreeShop());
        theList.add(2,new HealthyShop());
        return theList;
    }
    @Override
    public String toString() {
        return "Available companies " + producentsList().get(0).companyName() + " " + producentsList().get(1).companyName() + " " + producentsList().get(2).companyName();
    }
}
