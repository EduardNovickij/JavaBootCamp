package sef.module6.activity;

public class AbstractionActivity {
    public static void main(String arg[]){
        Rectangle r = new Rectangle(5,6,"Green");
        System.out.println("Rectangle:");
        System.out.println("Color: "+r.getColor());
        System.out.println("Area: "+r.calculateArea());
        System.out.println("Perimeter: "+r.calculatePerimeter()+"\n");

        Square s = new Square(5,"Blue");
        System.out.println("Square:");
        System.out.println("Color: "+s.getColor());
        System.out.println("Area: "+s.calculateArea());
        System.out.println("Perimeter: "+s.calculatePerimeter());
    }
}
