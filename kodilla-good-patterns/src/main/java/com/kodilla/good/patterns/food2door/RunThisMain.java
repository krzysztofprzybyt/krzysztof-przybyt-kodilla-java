package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class RunThisMain {

    public static void main (String args[]) {
        BoughtService boughtService = new BoughtService();
        BoughtService boughtService2 = new BoughtService();

        boughtService.orr("pear", 230);
        boughtService.orr("pear", 200);
        boughtService.orr("pear", 80);
        boughtService.orr("pork", 340);
        boughtService.orr("potato", 130);
        boughtService.orr("chicken", 230);
        System.out.println("---------------------------");
        boughtService2.orr("pear", 230);
        boughtService2.orr("pear", 200);
        boughtService2.orr("pear", 80);
        boughtService2.orr("pork", 340);
        boughtService2.orr("potato", 130);
        boughtService2.orr("chicken", 230);



    }
}

