package point;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.print(point3D);

        System.out.print("[");
        for (float e : point3D.getXYZ()) {
            System.out.print(e + ", ");
        }
        System.out.println("]");

        Point3D point3Da = new Point3D();
        System.out.print(point3Da);
        point3Da.setXYZ(3,4,5);

        System.out.print("[");
        for (float e : point3Da.getXYZ()) {
            System.out.print(e + ", ");
        }
        System.out.println("]");
    }
}
