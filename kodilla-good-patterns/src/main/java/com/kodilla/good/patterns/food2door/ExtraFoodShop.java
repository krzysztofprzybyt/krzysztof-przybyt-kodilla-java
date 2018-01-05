package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements ProducentInterface {
    private static final String companyName = "ExtraFoodShop";
    public String getCompanyName() {
        return companyName;
    }

    private HashMap<String, Integer> theItems = new HashMap<>();

    {
        theItems.put("apple", 100);
        theItems.put("pear", 500);
    }

    public HashMap<String, Integer> items(){
        return theItems;
    }

}
