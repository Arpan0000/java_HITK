/*
10. Write a program to obtain the sum of the n terms (n and x to be taken from the user) of the
	following series x – x^3/3! + x^5/5! - x^7/7!.......
 */

package assign1;

import java.util.Scanner;

public class series2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the range: ");
		int n =in.nextInt();
		System.out.print("Enter the coefficent: ");
		int x =in.nextInt();
		double sum=0;
		int fact=1;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=2*i-1; j++)
				fact*=j;
			sum+=(Math.pow(x, 2*i-1)/(fact))*(Math.pow(-1,i-1));
		}
		System.out.println("The sum of the first " + n + " terms is: " + sum);
	}

}
