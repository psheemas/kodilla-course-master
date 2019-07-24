package com.kodilla.testing.shape;

public class Circle implements Shape{
    private double pi = Math.PI;
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public void getShapeName(){
        System.out.println("Shape - Circle");
    }

    public double getField(){
        return pi*r*r;
    }

}