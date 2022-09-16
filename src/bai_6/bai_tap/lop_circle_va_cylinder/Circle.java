package bai_6.bai_tap.lop_circle_va_cylinder;

public class Circle {
    private double radius = 5;
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

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    public double getParameter() {
        return this.radius * 2 * Math.PI;
    }

    public void toString(double radius, String color) {
        System.out.println("Hình trong này có bán kính " + this.getRadius() + ", có màu " + this.getColor() + ", diện tích là " + this.getArea());
    }
}
