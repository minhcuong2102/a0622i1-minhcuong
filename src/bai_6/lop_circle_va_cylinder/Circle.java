package bai_6.lop_circle_va_cylinder;

public class Circle {
    private double radius = 5;
    private String color = "đỏ";

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public void toString(double radius, String color){
        System.out.println("Hình trong này có bán kính " + this.radius + " và có màu " + this.color);
    }
}
