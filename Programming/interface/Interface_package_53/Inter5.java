package Interface_package_53;

/*Complete the following:
i) Create a package named org.shapes.
ii) Create some classes in the package representing some common geometric shapes like
Square, Triangle, Circle and so on. The classes should contain area and perimeter
methods in them.
iii) Compile the package.
iv) Use this package to find area and perimeter of different shapes as chosen by the user. */

import org.shapes.*;

import java.util.Scanner;

public class Inter5 {
    public static void Inter5(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nChoose a shape to calculate area and perimeter:");
            System.out.println("1. Square");
            System.out.println("2. Circle");
            System.out.println("3. Triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the side of the square: ");
                    double side = in.nextDouble();
                    Square square = new Square(side);
                    System.out.println("Area: " + square.area());
                    System.out.println("Perimeter: " + square.perimeter());
                    break;
                case 2:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = in.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.println("Area: " + circle.area());
                    System.out.println("Perimeter: " + circle.perimeter());
                    break;
                case 3:
                    System.out.print("Enter the base of the triangle: ");
                    double base = in.nextDouble();
                    System.out.print("Enter the other two sides of the triangle: ");
                    double side1 = in.nextDouble();
                    double side2 = in.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    double height = in.nextDouble();
                    Triangle triangle = new Triangle(base, side1, side2, height);
                    System.out.println("Area: " + triangle.area());
                    System.out.println("Perimeter: " + triangle.perimeter());
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}
