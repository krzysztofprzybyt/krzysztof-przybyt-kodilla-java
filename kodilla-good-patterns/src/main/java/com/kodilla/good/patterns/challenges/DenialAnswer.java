package com.kodilla.good.patterns.challenges;

public class DenialAnswer implements Answer {
    @Override
    public void answer(User user, String item) {
        System.out.println(
                "Odrzucono zamównienie dla: "+user.getFirstName()+" "+user.getLastName()+
                        " - na produkt: \""+item+"\"\n");

    }
}
