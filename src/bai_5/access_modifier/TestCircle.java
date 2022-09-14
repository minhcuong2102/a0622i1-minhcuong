package bai_5.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5, "xanh");
        Circle circle2 = new Circle();
        Circle circle3 = new Circle(5);
        System.out.println("Diện tích hình tròn 2 là " + circle2.getArea());
        System.out.println("Hình tròn 1 có bán kính là " + circle1.getRadius() + ", có màu " + circle1.getColor());
        System.out.println("Bán kính hình trong 3 là " + circle3.getRadius());
    }
}
