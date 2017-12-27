package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){

        User user = new User("John", "Smith", "NY");

        String item = "Skarpetki";

        return new OrderRequest(user, item);
    }
}
