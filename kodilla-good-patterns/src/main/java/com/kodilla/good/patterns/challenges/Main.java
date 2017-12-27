package com.kodilla.good.patterns.challenges;

public class Main {

    public static void main (String args[])  {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve(
                new User("Jan", "Kowal", "Polska"), "skarpetki");
        OrderRequest orderRequest1 = orderRequestRetriever.retrieve(
                new User("Jan", "Kowalski", "Polska"), "kalosze");




        ProductOrderService productOrderService = new ProductOrderService(
                new SendService(), new OrderService(), new OrderRepository());

        productOrderService.process(orderRequest);
        productOrderService.process(orderRequest1);




    }
}
