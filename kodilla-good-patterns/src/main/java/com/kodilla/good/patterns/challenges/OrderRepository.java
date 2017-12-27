package com.kodilla.good.patterns.challenges;

public class OrderRepository {
    void createOrder(final User user, final String item){
        System.out.println("Przyjęto zamównienie dla: "+user+" na produkt: \""+item+"\"");
    }
}
