/*
 6. Write a program for determining whether a number is a Pearson number or not.
	(e.g. 145 is a Pearson number because 1! + 4! + 5! =145.)
 */

package assign1;

import java.util.Scanner;

public class pearson {
	
	//calculate the factorial
	static int fact(int n) {
		int fact =1;
		for(int i=2; i<=n; i++) {
			fact*=i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num =in.nextInt();
		
		if(num<0)
			System.out.println("Enter a positive number");
		else {
			int temp=num,sum=0;
			
			// Calculate the sum of factorials of each digit
			while(temp>0) {
				int r=temp%10;
				sum+=fact(r);
				temp/=10;
			}
			if(sum==num)
				System.out.println("The number "+num+" is a Pearson number");
			else
				System.out.println("The number "+num+" is not a Pearson number");
		}

	}

}
