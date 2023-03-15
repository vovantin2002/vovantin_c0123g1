package bai_6.point2d_and_point3d;


public class Point3D extends Point2D {
    private float z = 0;

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

    public Point3D() {
    }

    public void setXYZ(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        this.z = z;

    }

    public float[] getXYZ() {
        float[] arr1 = {this.getX(), this.getY(), this.z};
        return arr1;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
