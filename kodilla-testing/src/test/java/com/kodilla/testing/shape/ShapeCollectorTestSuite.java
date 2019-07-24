package com.kodilla.testing.shape;
import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @Before
    public void before() {
        System.out.println("Test Case:begin");
    }
    @After
    public void after(){
        System.out.println("Test case: end");
    }
    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure(){
        //Given
        Shape circle = new Circle(12.3);
        ShapeCollector sc = new ShapeCollector();
        //When
        sc.addFigure(circle);
        //Then
        Assert.assertEquals(circle, sc.getFigure(0));
    }
    @Test
    public void testRemoveFigure(){
        //Given
        Shape circle = new Circle(12.3);
        Shape square = new Square(12.3);
        ShapeCollector sc = new ShapeCollector();
        //When
        sc.addFigure(circle);
        sc.addFigure(square);
        sc.removeFigure(circle);
        //Then
        Assert.assertEquals(square, sc.getFigure(0));
    }
    @Test
    public void testGetFigure(){
        //Given
        Shape circle = new Circle(12.3);
        Shape square = new Square(12.3);
        ShapeCollector sc = new ShapeCollector();
        //When
        sc.addFigure(circle);
        sc.addFigure(square);
        //Then
        Assert.assertEquals(circle,sc.getFigure(0));
    }
}
