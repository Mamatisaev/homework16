package shape;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int radius = scan.nextInt();

        System.out.print("Area of this circle is: ");
        Circle.getArea(radius);

        System.out.print("Circumference of this circle is: ");
        Circle.getCircumference(radius);

    }
}