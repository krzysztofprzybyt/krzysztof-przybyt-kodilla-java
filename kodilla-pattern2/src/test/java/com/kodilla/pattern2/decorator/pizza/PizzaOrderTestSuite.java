package com.kodilla.pattern2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void TestPizzaOrderWithImplementsGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        pizzaOrder = new SauceDecorator(pizzaOrder);
        pizzaOrder = new MeatDecorator(pizzaOrder);
        pizzaOrder = new VegetableDecorator(pizzaOrder);
        pizzaOrder = new FruttiDiMareDecorator(pizzaOrder);
        pizzaOrder = new FruttiDiMareDecorator(pizzaOrder);

        //When
        BigDecimal cost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(34), cost);

    }
    @Test
    public void TestPizzaOrderWithImplementsGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        pizzaOrder = new SauceDecorator(pizzaOrder);
        pizzaOrder = new MeatDecorator(pizzaOrder);
        pizzaOrder = new VegetableDecorator(pizzaOrder);
        pizzaOrder = new FruttiDiMareDecorator(pizzaOrder);
        pizzaOrder = new FruttiDiMareDecorator(pizzaOrder);

        //When
        String description = pizzaOrder.getDescription();

        //Then
        assertEquals("Margaritta + cheese + sauce + meat + vege + Frutti di mare + Frutti di mare", description);

    }
}
