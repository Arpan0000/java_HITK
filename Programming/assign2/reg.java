/*
4.  The formula for resistors connected in parallel is a little more complex. Given two
	resistors with resistances R1 and R2 connected in parallel the equivalent resistance is
	given by the inverse of the sum of the inverses, i.e. * If there are more than two resistors
	you continue to invert the sum of their inverses; e.g. for four resistors you have: * Write a
	program that calculates the resistance of a group of resistors arranged in parallel.
 */
package assign2;
import java.util.*;
public class reg {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);

	        System.out.print("Enter the number of resistors in parallel: ");
	        int n = in.nextInt();
	        
	        double rsum = 0.0;
	        System.out.println("Enter the resistance values for each resistor:");
	        for (int i = 1; i <= n; i++) {
	            System.out.print("Resistance R" + i + ": ");
	            double res = in.nextDouble();
	            rsum += 1 / res;
	        }
	        
	        double ereg = 1 / rsum;
	        System.out.println("The equivalent resistance of the resistors in parallel is:  "+ ereg+" ohms");


	}

}
