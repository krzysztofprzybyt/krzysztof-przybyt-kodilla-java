package com.kodilla.pattern2.decorator.taxiportal;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class TaxiOrderTestSuite {
    @Test
    public void taxiBasicGetCostTest() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        //When
        BigDecimal calculatedCost = taxiOrder.getCost();
        //Then
        assertEquals(new BigDecimal(5.00), calculatedCost);
    }
    @Test
    public void taxiBasicGetDescriptionTest() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        //When
        String description = taxiOrder.getDescription();
        //Then
        assertEquals("Drive a course", description);
    }
    @Test
    public void testTaxiNetworkGetCost() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        //When
        BigDecimal getCost = taxiOrder.getCost();
        //Then
        assertEquals(new BigDecimal(40.0), getCost);
    }
    @Test
    public void testTaxiNetworkGetDescription() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        //When
        String description = taxiOrder.getDescription();
        //Then
        assertEquals("Drive a course by Taxi Network", description);
    }
    @Test
    public void testMyTaxiWithChildSeatGetDescription() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new MyTaxiOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        //When
        String description = taxiOrder.getDescription();
        //Then
        assertEquals("Drive a course by MyTaxi Network + child seat", description);
    }
    @Test
    public void testMyTaxiWithChildSeatGetcost() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new MyTaxiOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        //When
        BigDecimal getCost = taxiOrder.getCost();
        //Then
        assertEquals(new BigDecimal(37.0), getCost);
    }
    @Test
    public void testUberTaxiWithTwoChildSeatExpressServiceVipGetcost() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new UberNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        taxiOrder = new ExpressDecorator(taxiOrder);
        taxiOrder = new VipCarDecorator(taxiOrder);
        //When
        BigDecimal getCost = taxiOrder.getCost();
        //Then
        assertEquals(new BigDecimal(44.0), getCost);
    }


}
