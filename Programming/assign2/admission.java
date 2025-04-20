/*
 * 
2. Admission to a professional course is subject to the following conditions:
		(a) marks in Mathematics >= 60	 (b) marks in Physics >=50
		(c) marks in Chemistry >=40 	 (d) Total in all 3 subjects >=200

									(Or)

						Total in Maths & Physics>=150

Given the marks in the 3 subjects of n (user input) students, write a program to process
the applications to list the eligible candidates.

 */

package assign2;
import java.util.*;
public class admission {


	static boolean isEligible(int math, int physics, int chemistry) {

		boolean requrenment1 = (math >= 60 && physics >= 50 && chemistry >= 40);
		boolean requrenment2 = (math + physics + chemistry >= 200);
		boolean altrequrenment = (math + physics >= 150);
		return (requrenment1 && requrenment2) || altrequrenment;
		}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in)
		System.out.print("Enter the number of students: ");
        int n = in.nextInt();
		System.out.println("Enter the marks for each student in Mathematics, Physics, and Chemistry:");
		
		for (int i = 1; i <= n; i++) {

			System.out.println("Student " + i + ":");
			System.out.print("Mathematics: ");
			int math = in.nextInt();

			System.out.print("Physics: ");
			int physics = in.nextInt();

			System.out.print("Chemistry: ");
			int chemistry = in.nextInt();

			if (isEligible(math, physics, chemistry)) {
                System.out.println("Student " + i + " is eligible for admission.");
            } else {
                System.out.println("Student " + i + " is not eligible for admission.");
            }
        }

	}

}
