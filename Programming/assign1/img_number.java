/*
 * 
2. Write a program to find the roots (real and imaginary) of the quadratic equation of the form
   ax2 + bx + c = 0.

*/

package assign1;

import java.util.Scanner;

public class img_number {

	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);
		System.out.println("Enter the coefficient of your equations ");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = b*b-(4*a*c);
		double r1,r2;
		if(d>0) {
			r1=(-b+Math.sqrt(d))/(2*a);
			r2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("The roots are :  Root1 -->"+r1+"and Root2 -->"+r2);
		}
		else if(d==0) {
			r1=r2=-b/(2*a);
			System.out.println("The roots are :"+r1+"and"+r2);
		}
		else {
		 int real= -b/(2*a);
		 double img=Math.sqrt(-d)/(2*a);
		 System.out.println("The roots are :");
		 System.out.println("Root 1:"+real+"+"+img+"i");
		 System.out.println("Root 2:"+real+"-"+img+"i");
		}
	}

}
