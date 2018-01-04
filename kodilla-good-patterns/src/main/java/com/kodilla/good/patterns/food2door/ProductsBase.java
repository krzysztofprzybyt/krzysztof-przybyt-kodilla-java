package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ProductsBase {
    private ExtraFoodShop extraFoodShop = new ExtraFoodShop();
    private GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
    private HealthyShop healthyShop = new HealthyShop();

    private HashMap<String,ProducentInterface> baza =  new HashMap<>();
    {
        baza.put("pear", extraFoodShop);
        baza.put("apple", extraFoodShop);
        baza.put("pork", glutenFreeShop);
        baza.put("chicken", glutenFreeShop);
        baza.put("carrot", healthyShop);
        baza.put("potato", healthyShop);
    }
    public HashMap<String, ProducentInterface> getBaza() {
        return baza;
    }
//    private Set<ProducentInterface> baseSet =  new HashSet<>();
//    {
//        baseSet.add(extraFoodShop);
//        baseSet.add(glutenFreeShop);
//        baseSet.add(healthyShop);
//    }
//
//
//    public Set<ProducentInterface> getBaseSet() {
//        return baseSet;
//    }

}
