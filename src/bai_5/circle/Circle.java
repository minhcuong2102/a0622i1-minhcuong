package bai_5.circle;

public class Circle {
    private static double radius = 1.0;
    private static String color = "đỏ";

    Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return radius * radius * 3.14;
    }


}
