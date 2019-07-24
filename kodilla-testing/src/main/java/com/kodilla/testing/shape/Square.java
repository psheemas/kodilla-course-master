package com.kodilla.testing.shape;

public class Square implements Shape{
    private double aSquare;

    public Square(double aSquare) {
        this.aSquare = aSquare;
    }

    public void getShapeName(){
        System.out.println("Shape - Square");
    }

    public double getField(){
        return aSquare*aSquare;
    }
}