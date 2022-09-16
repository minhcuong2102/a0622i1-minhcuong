package bai_6.bai_tap.lop_circle_va_cylinder;

public class Cylinder extends Circle{
    private double height = 4;

    public Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }

    public Cylinder(){
        super();
    }

    public Cylinder(double height){
        super();
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    public double getSurrondingArea(){
        return super.getParameter() * this.height;
    }

    public double getTotalArea(){
        return super.getArea() * 2 + this.getSurrondingArea();
    }

    public double getVolume(){
        return super.getArea() * height;
    }

    public String toString(){
        return "Hình trụ này có chiều cao là " + this.height + ", thể tích bằng " + this.getVolume();
    }
}
