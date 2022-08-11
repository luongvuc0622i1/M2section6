package circleCylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(5, "red", 10);
        System.out.println(cylinder);

        cylinder.setRadius(7.3);
        cylinder.setHeight(3.5);
        cylinder.setColor("black");
        System.out.println(cylinder);
    }
}
