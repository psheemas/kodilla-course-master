package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private double aTriangle;
    private double hTriangle;

    public Triangle(double aTriangle, double hTriangle) {
        this.aTriangle = aTriangle;
        this.hTriangle = hTriangle;
    }

    public void getShapeName(){
        System.out.println("Shape - Triangle");
    }

    public double getField(){
        return aTriangle*hTriangle/2;
    }
}