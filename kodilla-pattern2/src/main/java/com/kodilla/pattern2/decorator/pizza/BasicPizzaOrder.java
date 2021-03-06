package com.kodilla.pattern2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(10.0);
    }

    @Override
    public String getDescription() {
        return "Margaritta";
    }
}
