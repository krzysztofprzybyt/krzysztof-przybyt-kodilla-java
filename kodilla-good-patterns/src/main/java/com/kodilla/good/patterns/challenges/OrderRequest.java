package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    final User user;
    final String item;

    public OrderRequest(final User user, final String item) {
        this.item = item;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public String getItem() {
        return item;
    }

}
