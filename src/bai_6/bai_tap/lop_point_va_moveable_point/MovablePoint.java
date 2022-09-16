package bai_6.bai_tap.lop_point_va_moveable_point;

public class MovablePoint extends Point{
    public float xSpeed = 0.0f;
    public float ySpeed = 0.0f;

    public MovablePoint(){

    }

    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        return new float[]{this.getXSpeed(), this.getYSpeed()};
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString(){
        return "Điểm này có toạ độ (" + super.getX() + ", " + super.getY() + "), có tốc độ là (" + this.getXSpeed() + ", " + this.getYSpeed() + ").";
    }

    public MovablePoint move(){
        setX(getX() + getXSpeed());
        setY(getY() + getYSpeed());
        return this;
    }
}
