package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public class AvaibleItems {

    private static HashMap<String, Integer> theItems = new HashMap<>();
    static {theItems.put("skarpetki", 2);
        theItems.put("kalosze", 5);
    }

    public static Map<String, Integer> items(){



        return theItems;
    }
}
