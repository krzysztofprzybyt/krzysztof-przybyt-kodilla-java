package com.kodilla.pattern2.decorator.pizza;

import java.math.BigDecimal;

public class SauceDecorator extends AbstractPizzaOrderDecorator {
    public SauceDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + sauce";
    }
}
