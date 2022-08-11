package point;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.print(point2D);

        System.out.print("[");
        for (float e : point2D.getXY()) {
            System.out.print(e + ", ");
        }
        System.out.print("]");
    }
}
