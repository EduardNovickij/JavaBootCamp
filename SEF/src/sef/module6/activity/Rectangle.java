package sef.module6.activity;

public class Rectangle extends Shape{
    private double length, breadth;

    public Rectangle(){
        length = 1;
        breadth = 1;
        color = "Red";
    }
    public Rectangle(double x, double y, String c){
        length = x;
        breadth = y;
        color = c;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(length+breadth);
    }

    @Override
    public double calculateArea() {
        return length*breadth;
    }
}
