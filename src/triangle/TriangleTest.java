package triangle;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);

        triangle.setSide1(3);
        triangle.setSide2(4);
        triangle.setSide3(5);
        triangle.setColor("Yellow");
        triangle.setFilled(false);
        System.out.println(triangle);

        triangle = new Triangle("Blue", false, 6, 6, 6);
        System.out.println(triangle);
    }
}
