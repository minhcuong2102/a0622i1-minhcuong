package bai_6.bai_tap.lop_point2d_va_point3d;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {

    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{this.getX(), this.getY(), this.getZ()};
    }

    public void setXYZ() {

    }

    public String toString() {
        return "Điểm này có toạ độ (" + super.getX() + ", " + super.getY() + ", " + this.getZ() + ").";
    }
}
