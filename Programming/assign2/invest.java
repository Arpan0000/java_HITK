/*
 * 
3. Write a program to evaluate, the following investment equation: V=P ( 1 + r )n
	and print the tables which would give the values of V for various combinations of the
	following values of P, r & n.
	P : 1000,2000,3000,...........,10,000 R : 0.10,0.11,0.12,................0.20
	n : 1,2,3,..............................,10
 */

package assign2;

public class invest {

	public static void main(String[] args) {
		
		// Principal amounts
		int[] principalValues = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000};

		// Interest rates
		double[] interestRates = {0.10, 0.11, 0.12, 0.13, 0.14, 0.15, 0.16, 0.17, 0.18, 0.19, 0.20};

		// Number of years
		int[] years = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		// Display table header
		System.out.println("Principal       Rate     Years     Investment Value (V)");
		System.out.println("---------------------------------------------------------------");

		// display the investment
		for (int P : principalValues) {
			for (double r : interestRates) {
				for (int n : years) {
					double V = investment(P, r, n);
					System.out.println(P+"            "+r+"         "+n+"         "+V);
				}
			}
		}
	}

	//calculate the investment value (V)
	public static double investment(int P, double r, int n) {
		return P * Math.pow(1 + r, n);
	}
}

