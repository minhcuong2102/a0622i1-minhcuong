package bai_4.fan;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;

    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "xanh";

    public Fan(int speed,  double radius, String color, boolean on) {
        this.speed = speed;
        this.on = on;
        this.color = color;
        this.radius = radius;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean getOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String toString(){
        String stateOfFan = "";
        if (this.getOn()){
            System.out.print("Quạt đang chạy với tốc độ " + this.speed + ", ");
        }else {
            System.out.print("Quạt đang tắt, ");
        }
        stateOfFan += "có bán kính là " + this.radius + " và có màu " + this.color;
        return stateOfFan;
    }
}
