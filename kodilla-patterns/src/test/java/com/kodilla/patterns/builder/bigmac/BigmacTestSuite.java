package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("with sesam")
                .burgers(3)
                .sauce("hot")
                .ingredients("onion")
                .ingredients("cucumber")
                .ingredients("salad")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        String whichSauce = bigmac.getSauce();
        String whichRorr = bigmac.getRoll();
        //Then
        Assert.assertEquals(3, howManyIngredients);
        Assert.assertEquals(3, howManyBurgers);
        Assert.assertEquals("hot", whichSauce);
        Assert.assertEquals("with sesam", whichRorr);


    }
}
