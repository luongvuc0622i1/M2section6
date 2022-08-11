package moveablePoint;

public class MoveablePointTest {
    public static void main(String[] args) {
        Point point = new MoveablePoint(20, 30,40,50);
        System.out.println(point);

        ((MoveablePoint) point).move();
        System.out.println(point);
        MoveablePoint anotherPoint = new MoveablePoint(60,70,20,20);
        System.out.println(anotherPoint.toString());
        anotherPoint.move();
        System.out.println(anotherPoint.toString());
    }
}
