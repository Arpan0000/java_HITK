/*
 8. Write a Program in Python to find the sum of all the Prime numbers between a given range of 
    numbers.
*/

package assign1;

import java.util.Scanner;

public class prime__sum {

	
	//function to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    // function to calculate the sum of primes 
    public static int sum_p(int start, int end) {
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }
    
    
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int start,end;
		System.out.print("Enter the start of the range: ");
        start = in.nextInt();

        System.out.print("Enter the end of the range: ");
        end = in.nextInt();
		
        int sum = sum_p(start, end);
        System.out.println("The sum of prime numbers between " + start + " and " + end + " is: " + sum);
	}

}
