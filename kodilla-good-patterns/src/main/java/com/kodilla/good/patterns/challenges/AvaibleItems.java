package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public class AvaibleItems {
    public static Map<String, Integer> items(){
        HashMap<String, Integer> theItems = new HashMap<>();
        theItems.put("skarpetki", 2);
        theItems.put("kalosze", 5);

        return theItems;
    }
}
