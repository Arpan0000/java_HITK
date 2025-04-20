/**
3. The nos. in the sequence 0 1 1 2 3 5 8 13 21............. are called Fibonacci nos. Write a
   program to print the first n (to be taken as input) Fibonacci nos.
 * 
 */
package assign1;

import java.util.Scanner;

public class fibbo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the nth term of Fibonacci series");
		int n= in.nextInt();
		
		if(n<=0)
			 System.out.println("Please enter a positive integer or number greater than 0");
		else {
			int first=0,sec=1;
			System.out.print("The first " + n + " Fibonacci numbers are: ");
			for (int i=0; i<n; i++) {
				 System.out.print(first+"  ");
				 int next = first+sec;
				 first=sec;
				 sec=next;
			}
		}
	}

}
