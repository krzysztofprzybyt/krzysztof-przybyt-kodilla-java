package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;
import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] data = {2, 8, 4, 8, 4, 6};
        //When
        double average = getAverage(data);
        //Then
        double expected = 5.33;
        Assert.assertEquals(expected, average, 0.01);

    }
}
