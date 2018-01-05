package com.kodilla.good.patterns.food2door;

import java.util.HashMap;

public class HealthyShop implements ProducentInterface {
    private static final String companyName = "HealthyShop";
    public String getCompanyName() {
        return companyName;
    }

    private HashMap<String, Integer> theItems = new HashMap<>();

    {
        theItems.put("carrot", 1000);
        theItems.put("potato", 1500);
    }

    public HashMap<String, Integer> items(){
        return theItems;
    }
}
