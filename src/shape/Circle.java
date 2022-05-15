package shape;

public class Circle {

    private static final double PI = Math.PI;

    public Circle() {
    }

    static void getArea(int radius) {
        System.out.println(Math.PI * (radius * radius));
    }

    static void getCircumference(int radius) {
        System.out.println(Math.PI * 2 * radius);
    }

}