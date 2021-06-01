package sef.module6.activity;

public class Square extends Shape {
    private double side;

    public Square(double x, String c){
        side = x;
        color = c;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(side + side);
    }
}
