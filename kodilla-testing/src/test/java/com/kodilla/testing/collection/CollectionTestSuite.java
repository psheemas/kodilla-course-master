package com.kodilla.testing.collection;

import java.util.*;
import org.junit.*;


public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case begin");
    }
    @After
    public void after(){
        System.out.println("Test case end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> emptyLibrary = new ArrayList<Integer>();
        System.out.println(emptyLibrary);
        OddNumbersExterminator tester1 = new OddNumbersExterminator();
        //When
        ArrayList<Integer> resultEmptyList = tester1.exterminate(emptyLibrary);
        //Then
        Assert.assertEquals(emptyLibrary,resultEmptyList);

    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> filledLibrary = new ArrayList<Integer>();
        filledLibrary.add(1);
        filledLibrary.add(3);
        filledLibrary.add(4);
        filledLibrary.add(2);
        filledLibrary.add(7);
        filledLibrary.add(8);
        filledLibrary.add(9);
        filledLibrary.add(11);

        ArrayList<Integer> filledLibraryEven = new ArrayList<Integer>();
        filledLibraryEven.add(4);
        filledLibraryEven.add(2);
        filledLibraryEven.add(8);

        System.out.println(filledLibrary);
        OddNumbersExterminator tester = new OddNumbersExterminator();
        //When
        ArrayList<Integer> resultNormalList = tester.exterminate(filledLibrary);
        //Then
        Assert.assertEquals(filledLibraryEven,resultNormalList);
    }
}
