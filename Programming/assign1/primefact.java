/*
 * 
5. Write a program to find the prime factors of the given number . (e.g. Input : 315 Output: 3 3
   5 7)
 */

package assign1;

import java.util.Scanner;

public class primefact {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num =in.nextInt();

		if(num<=1)
			System.out.println("Enter a number greater than 1");
		else {
			// Divide by 2 until the number is odd
			while (num % 2 == 0) {
				System.out.print(2 + " ");
				num /= 2;
			}

			// Check for odd factors from 3 onward
			for (int i = 3; i <= Math.sqrt(num); i += 2) {
				while (num % i == 0) {
					System.out.print(i + " ");
					num /= i;
				}
			}

			// when num is prime
			if(num>2)
				System.out.print(num);
		}
	}
}
