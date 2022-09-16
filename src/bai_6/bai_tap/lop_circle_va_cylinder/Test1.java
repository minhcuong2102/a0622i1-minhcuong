package bai_6.bai_tap.lop_circle_va_cylinder;

public class Test1 {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.setRadius(10);
        circle1.setColor("vàng");
        System.out.println("Diện tích hình tròn: " + circle1.getArea());

        Cylinder cylinder1 = new Cylinder(circle1.getRadius(), circle1.getColor(), 6);
        cylinder1.getVolume();
        System.out.println(cylinder1);
    }
}
