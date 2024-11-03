import java.util.Scanner;

class MethodOverloading {
    double area(double radius) {
        return 3.14 * radius * radius;
    }
    float area(float length, float breadth) {
        return length * breadth;
    }
    double area(double base, double height) {
        return (base * height) / 2.0;
    }
}

public class MethodOverload {
    public static void main(String[] args) {
        double radius, circleArea, rectangleArea, base, height, triangleArea;
        float length, breadth;
        Scanner sc = new Scanner(System.in);
        MethodOverloading calc = new MethodOverloading();

                System.out.print("Enter the radius of the circle: ");
                radius = sc.nextDouble();
                circleArea = calc.area(radius);
                System.out.printf("The area of the circle is: %.3f \n", circleArea);

                System.out.print("Enter the length of the rectangle: ");
                length = sc.nextFloat();
                System.out.print("Enter the breadth of the rectangle: ");
                breadth = sc.nextFloat();
                rectangleArea = calc.area(length, breadth);
                System.out.printf("The area of the rectangle is: %.3f\n", rectangleArea);

                System.out.print("Enter the base of the triangle: ");
                base = sc.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                height = sc.nextDouble();
                triangleArea = calc.area(base, height);
                System.out.printf("The area of the triangle is: %.3f\n", triangleArea);
        sc.close();
    }
}
