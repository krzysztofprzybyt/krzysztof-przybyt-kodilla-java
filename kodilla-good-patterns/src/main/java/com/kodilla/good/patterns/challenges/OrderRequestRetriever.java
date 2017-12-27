package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {

    private User user;
    private String item;

    public OrderRequest retrieve(final String firstName,final String lastName,final String address, final String item){

         this.user = new User(firstName, lastName, address);
         this.item = item;

        return new OrderRequest(user, item);
    }
}
