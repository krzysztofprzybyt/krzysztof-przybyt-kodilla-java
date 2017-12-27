package com.kodilla.good.patterns.challenges;

public class OrderRepository implements Answer {
    public void answer(final User user, final String item){
        System.out.println(
                "Przyjęto zamównienie dla: "+user.getFirstName()+" "+user.getLastName()+" - na produkt: \""+item+"\"");
    }
}
