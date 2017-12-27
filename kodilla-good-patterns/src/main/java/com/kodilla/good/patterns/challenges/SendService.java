package com.kodilla.good.patterns.challenges;

public class SendService {
    public void post(User user){
        System.out.println("wysłano do: "+user.getFirstName()+" na adres: "+user.getAddress()+"\n");
    }
}
