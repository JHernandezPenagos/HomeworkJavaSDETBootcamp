package com.ti.abstraction;

public class Rectangle extends Shape{
    private final double width; // es final para que no se pueda cambiar despues de enviarse
    private final double length;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return 2*(width + length);
    }

    @Override
    public String shapeName(){
        return "I'm Rectangle";
    }
}
