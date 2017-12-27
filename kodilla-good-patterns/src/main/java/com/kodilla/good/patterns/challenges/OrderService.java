package com.kodilla.good.patterns.challenges;


public class OrderService {

    public boolean order(User user, String item) {
        if(AvaibleItems.items().containsKey(item)){
            if(AvaibleItems.items().get(item) > 0){
                int count = AvaibleItems.items().get(item)-1;
                AvaibleItems.items().replace(item, count);
                return true;
            }
            System.out.println("Brak wystarczającej ilości produktu.");
            return false;
         }
        System.out.println("Brak karty produktu.");
        return false;
    }
}
