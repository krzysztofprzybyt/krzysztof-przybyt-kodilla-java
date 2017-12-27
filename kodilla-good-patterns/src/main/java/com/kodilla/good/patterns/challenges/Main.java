package com.kodilla.good.patterns.challenges;

public class Main {

    public static void main (String args[])  {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve(
                "Jan", "Kowal", "Polska", "skarpetki");
        OrderRequest orderRequest1 = orderRequestRetriever.retrieve(
                "Jan", "Kowalski", "Polska", "kalosze");
        OrderRequest orderRequest2 = orderRequestRetriever.retrieve(
                "Zygmunt", "Kowalewski", "Polska", "majtki");
        OrderRequest orderRequest3 = orderRequestRetriever.retrieve(
                "Anna", "Nowak", "Polska", "skarpetki");
        OrderRequest orderRequest4 = orderRequestRetriever.retrieve(
                "Jan", "Kowalski", "Polska", "skarpetki");





        ProductOrderService productOrderService = new ProductOrderService(
                new SendService(), new OrderService(), new OrderRepository(), new DenialAnswer());

        productOrderService.process(orderRequest);
        productOrderService.process(orderRequest1);
        productOrderService.process(orderRequest2);
        productOrderService.process(orderRequest3);
        productOrderService.process(orderRequest4);




    }
}
