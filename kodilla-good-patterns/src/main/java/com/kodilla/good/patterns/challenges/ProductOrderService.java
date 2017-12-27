package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private SendService sendService;
    private OrderService orderService;
    private OrderRepository orderRepository;
    private DenialAnswer denialAnswer;

    public ProductOrderService(final SendService sendService,
                           final OrderService orderService,
                           final OrderRepository orderRepository,
                            final DenialAnswer denialAnswer) {
        this.sendService = sendService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
        this.denialAnswer = denialAnswer;
    }

    public OrderDto process(final OrderRequest orderRequest)  {
        boolean isBuy = false;

            isBuy = orderService.order(orderRequest.getUser(), orderRequest.getItem());


        if(isBuy) {
            orderRepository.answer(orderRequest.getUser(), orderRequest.getItem());
            sendService.post(orderRequest.getUser());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            denialAnswer.answer(orderRequest.getUser(), orderRequest.getItem());
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
