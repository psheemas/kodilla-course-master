package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {
    public OrderRequest retrieve(){
        User user = new User("Janusz","Kulepa","jkulepa@coldMail.com","600259628","Zielna 5 Warszawa");
        Item item = new Item("Kolczyki",20);
        return new OrderRequest(user,item);
    }
}
