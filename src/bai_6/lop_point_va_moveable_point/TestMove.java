package bai_6.lop_point_va_moveable_point;

public class TestMove {
    public static void main(String[] args) {
        Point point1 = new Point();
        point1.setX(6);
        point1.setY(7);
        System.out.println(point1);

        point1.setXY(2, 3);
        System.out.println(point1);
        MovablePoint point2 = new MovablePoint();
        point2.setSpeed(5, 5);
        System.out.println(point2);
        point2.move();
        System.out.println(point2);
    }
}
