package bai_5.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "đỏ";

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }
}
