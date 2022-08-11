package moveablePoint;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.print(point);

        System.out.print("[");
        for (float e : point.getXY()) {
            System.out.print(e + ", ");
        }
        System.out.print("]");
    }
}
