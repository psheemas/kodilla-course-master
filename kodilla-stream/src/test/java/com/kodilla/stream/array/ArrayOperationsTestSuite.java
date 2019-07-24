package com.kodilla.stream.array;


import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        int[] numbers = {12,312,123,123,123,123,122};
        Assert.assertEquals(134.0,ArrayOperations.getAverage(numbers),0.1);
    }
}
