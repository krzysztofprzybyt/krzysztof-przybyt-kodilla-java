package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {

    private User user;
    private String item;

    public OrderRequest retrieve(final User user, final String item){

         this.user = user;
         this.item = item;

        return new OrderRequest(user, item);
    }
}
