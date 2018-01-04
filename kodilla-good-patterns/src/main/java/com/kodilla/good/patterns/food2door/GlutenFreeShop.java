package com.kodilla.good.patterns.food2door;

import java.util.HashMap;

public class GlutenFreeShop implements ProducentInterface {
    private static final String companyName = "GlutenFreeShop";
    public String getCompanyName() {
        return companyName;
    }

    private static HashMap<String, Integer> theItems = new HashMap<>();

    static {
        theItems.put("chicken", 300);
        theItems.put("pork", 500);
    }

    public HashMap<String, Integer> items(){

        return theItems;
    }
}
