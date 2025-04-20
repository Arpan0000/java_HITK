/*
9.  Write a program to obtain the sum of the n terms (n to be taken from the user) of the
following series 1-3^2/2+5^3/3-.....

*/
package assign1;

import java.util.Scanner;

public class series1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the range: ");
		int n =in.nextInt();
		double sum=0;
		
		for(int i=1; i<=n; i++)
			sum=sum+(Math.pow(2*i-1,i)/i)*Math.pow(-1,i-1);
		System.out.println("The sum of the first " + n + " terms is: " + sum);
	}

}
