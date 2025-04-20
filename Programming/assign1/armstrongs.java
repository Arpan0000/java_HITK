/*
7. Write a program to find all Armstrong numbers in the range 1 to M, where M is taken
	as input. 
*/

package assign1;

import java.util.Scanner;

public class armstrongs {

	static boolean isArmstrong(int num) {
		int temp= num,sum=0;
		int num_len=((int)Math.log10(temp))+1;	//calculating the length of the num
		
		//armstrong calculation
		while(temp>0) {
			int r=temp%10;
			sum+=Math.pow(r,num_len);
			temp/=10;
		}
		
		return sum == num;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the range: ");
		int M =in.nextInt();

		if(M<=1)
			System.out.println("Enter a valid range");
		else {
			System.out.println("Armstrong numbers from 1 to " + M + " are:");
			for (int i = 1; i <= M; i++) {
				if (isArmstrong(i)) {
					System.out.print(i + " ");
				}
			}
		}

	}
}
