package com.kodilla.good.patterns.food2door;

import java.util.HashMap;


public class BoughtService {

    ProductsBase productsBase = new ProductsBase();
    HashMap<String, ProducentInterface> products = productsBase.getBaza();

    public boolean orr(String prod, Integer howM) {

        if (products.containsKey(prod)) {
            ProducentInterface kto= products.get(prod);
            System.out.println("Produkt \""+prod+"\" występuje w "+kto.getCompanyName());
            System.out.println("obecnie dostępne: "+kto.items().get(prod)+" kg");
            if (kto.items().get(prod) >= howM ) {
                int count = kto.items().get(prod) - howM;
                kto.items().replace(prod, count);
                System.out.println("Udało się zakupić planowane "+howM+" kg");
                System.out.println("pozostało na stanie: "+kto.items().get(prod)+" kg\n");
                return true;
            }
            System.out.println("Brak wystarczającej ilości produktu u dostawcy.\n");
            return false;
        }
        System.out.println("Nie znaleziono produktu u żadnego dostawcy.\n");
        return false;
    }
}

