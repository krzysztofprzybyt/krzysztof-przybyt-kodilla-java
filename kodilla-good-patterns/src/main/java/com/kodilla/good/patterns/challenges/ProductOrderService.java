package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private SendService sendService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final SendService sendService,
                           final OrderService orderService,
                           final OrderRepository orderRepository) {
        this.sendService = sendService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest)  {
        boolean isBuy = false;

            isBuy = orderService.order(orderRequest.getUser(), orderRequest.getItem());


        if(isBuy) {
            sendService.post(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getItem());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
