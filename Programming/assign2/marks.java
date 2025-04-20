/*
1. Given a list of marks (ranging from 0 to 100) of n (user input) students, write a program to
	print the number of students who have obtain marks:
		(a) in the range 81 to 100   (b) in the range 61 to 80
		c) in the range 41 to 60    (d) in the range 0 to 40 

*/

package assign2;
import java.util.*;

public class marks {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
        int n = in.nextInt();
        
        int r81to100 = 0;
        int r61to80 = 0;
        int r41to60 = 0;
        int r0to40 = 0;
        
        System.out.println("Enter the marks for each student:");
        for (int i = 0; i < n; i++) {
            int mark = in.nextInt();

            // Check which range the mark falls into
            if (mark >= 81 && mark <= 100) {
                r81to100++;
            } else if (mark >= 61 && mark <= 80) {
                r61to80++;
            } else if (mark >= 41 && mark <= 60) {
                r41to60++;
            } else if (mark >= 0 && mark <= 40) {
                r0to40++;
            } else {
                System.out.println("Invalid mark entered "+mark+". Please enter a number between 0 and 100.");
            }
        }
        
        System.out.println("Number of students in the range 81 to 100: " + r81to100);
        System.out.println("Number of students in the range 61 to 80: " + r61to80);
        System.out.println("Number of students in the range 41 to 60: " + r41to60);
        System.out.println("Number of students in the range 0 to 40: " + r0to40);


	}

}
