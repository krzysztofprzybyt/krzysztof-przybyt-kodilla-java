package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class BoughtService {

    ProductsBase productsBase = new ProductsBase();
    HashMap<String, ProducentInterface> products = productsBase.getBaza();
//    Set<ProducentInterface> bazaProd = productsBase.getBaseSet();


// public boolean order(ProducentInterface producent, String product, Integer howMany) {
//     HashMap<String, Integer> products = (HashMap<String, Integer>) producent.items();
//     if (products.containsKey(product)) {
//               if (products.get(product) >= howMany ) {
//                    int count = products.get(product) - howMany;
//                    products.replace(product, count);
//                    return true;
//                }
//                System.out.println("Brak wystarczającej ilości produktu.");
//                return false;
//            }
//            System.out.println("Brak karty produktu.");
//            return false;
//        }
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

