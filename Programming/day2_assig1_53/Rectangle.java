package day2_assig1_53;

/*Write a program to print the area of a rectangle by creating a class named 'Area' having two
methods. First method named as 'setDim' takes length and breadth of rectangle as parameters
and the second method named as 'getArea' returns the area of the rectangle. Length and breadth
of rectangle are entered through keyboard.*/

import java.util.*;

class area{
	double length;
	double breadth;
	void setDim(double len ,double bred) {
		length=len;
		breadth=bred;
	}
	
	double getArea() {
		return length*breadth;
	}
}

public class Rectangle {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the length of the rectangle");
		double length=in.nextDouble();
		System.out.println("Enter the breadth of the rectangle");
		double breadth=in.nextDouble();
		area a = new area();
		a.setDim(length, breadth);
		double rec_area=a.getArea();
		System.out.println("The area of the rectangle is :  "+rec_area);
		
	}

}
