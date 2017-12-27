package com.kodilla.good.patterns.challenges;


public class OrderService {

    public boolean order(User user, String item) {
        return AvaibleItems.items().get(item) > 0;


    }
}
