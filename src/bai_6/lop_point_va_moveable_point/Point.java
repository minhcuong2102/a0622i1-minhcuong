package bai_6.lop_point_va_moveable_point;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point() {

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{this.getX(), this.getY()};
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Điểm này có toạ độ (" + this.getX() + ", " + this.getY() + ").";
    }
}
