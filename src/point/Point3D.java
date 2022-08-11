package point;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
        z = 0.0f;
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
        float[] arr = {getY(), getX(), z};
        return arr;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D: " +
                "x=" + getXYZ()[0] +
                ", y=" + getXYZ()[1] +
                ", z=" + getXYZ()[2] +
                " Array is: "
                ;
    }
}