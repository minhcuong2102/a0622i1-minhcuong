package bai_7.bai_tap.interface_colorable;

public class TestColorable {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(x, "yellow", false);
        shapes[1] = new Rectangle(x, x, "blue", true);
        shapes[2] = new Square(x, "red", true);

        for (Shape a : shapes){
            System.out.println(a);
        }
        Shape.printShape(shapes);

    }
}
