/*
4. Write a program for determining whether a number is a Perfect number or not.
   (e.g. 28 is a Perfect Number because Sum of the Divisor of 28 = 1+2+4+7+14 =28.)
*/

package assign1;

import java.util.Scanner;

public class perfect {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num =in.nextInt();
		
		if(num<=1) 
			System.out.print("The number "+num+" is not a perfect number");
		else {
			int sum=0,temp=num;
			for(int i=1; i<=temp/2; i++) {
				if(temp%i ==0) {
					sum+=i;
				}
			}
			if(sum == num)
				System.out.print("The number "+num+" is a perfect number");
			else
				System.out.print("The number "+num+" is not a perfect number");
		}

	}

}
