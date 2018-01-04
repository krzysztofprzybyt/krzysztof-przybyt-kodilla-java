package com.kodilla.good.patterns.food2door;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RunThisMain {

    public static void main (String args[]) {
        System.out.println("Start");

        BoughtService boughtService = new BoughtService();

        boughtService.orr("pear", 230);
        boughtService.orr("pear", 200);
        boughtService.orr("pear", 80);
        boughtService.orr("pork", 340);
        boughtService.orr("potato", 130);
        boughtService.orr("chicken", 230);

//        ProductsBase baza = new ProductsBase();
//
//        List<ProducentInterface> pro = baza.getBaseSet().stream().collect(Collectors.toList());
//        Collection<ProducentInterface> klienci = baza.getBaza().values();
//        for(int i = 0; i<pro.size();i++)
//        System.out.println("Dostawca: "+pro.get(i).getCompanyName()+"\nprodukty: "+pro.get(i).items()+"\n");
//
//
//        Set<String> dostawcy = klienci.stream()
//                .map(a->a.getCompanyName())
//                .collect(Collectors.toSet());
//        System.out.println("Dostawcy: "+dostawcy);
//
//        Set<HashMap<String, Integer>> produkty = klienci.stream()
//                .map(b->b.items())
//                .collect(Collectors.toSet());
//        System.out.println(produkty);





    }
}

