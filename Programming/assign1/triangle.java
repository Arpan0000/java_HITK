/*
 * 
1. Write a program that reads three coordinate and calculate the side of triangle. Check whether
   these numbers can be considered as the three sides of a triangle. If so, find the type
   (isosceles, equilateral or right-angled) and area of the triangle.

 */

package assign1;
import java.util.*;

public class triangle {

	//distance calculation between the coodinates
	public static double Distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}

	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);
		System.out.println("Enter the coodinates of the triangle:");

		// Taking the input of the coodinates
		System.out.print("Vertex 1 (x1, y1): ");
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();

		System.out.print("Vertex 2 (x2, y2): ");
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();

		System.out.print("Vertex 3 (x3, y3): ");
		double x3 = in.nextDouble();
		double y3 = in.nextDouble();

		double a = Distance(x1, y1, x2, y2);
		double b = Distance(x2, y2, x3, y3);
		double c = Distance(x3, y3, x1, y1);

		//System.out.println(a+","+b+","+c);
		//validity checking of a triangle
		if ((a + b > c) && (a + c > b) && (b + c > a)) {
			System.out.println("The coodinates are of a valid triangle");
			if (a == b && b == c) {
				System.out.println( "The triangle is Equilateral");
			} else if (a == b || b == c || a == c) {
				System.out.println( "The triangle is Isosceles");
			} else if ((Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) ||
					(Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)) ||
					(Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2))) {
				System.out.println( "The triangle is Right-angled");
			} else {
				System.out.println( "The triangle is Scalene");
			}

			//calculating the area of the triangle
			double s = (a + b + c) / 2; // Semi-perimeter
			double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
			System.out.println( "Area of the triangle is "+area);
		}
		else {
			System.out.println("The coodinates are not valid for triangle");
		}
	}

}
