package assign2;
import java.util.*;
public class dep_value {

	public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);

	        // Input the purchase price
	        System.out.print("Enter the purchase price of the item: ");
	        double purchase = in.nextDouble();

	        // Input the years of service
	        System.out.print("Enter the years of service: ");
	        int year = in.nextInt();

	        // Input the annual depreciation
	        System.out.print("Enter the annual depreciation: ");
	        double annualDep = in.nextDouble();

	        // Calculate salvage value
	        double salvageValue =  purchase - (annualDep * year);

	        System.out.println("The salvage value of the item is:"+salvageValue);

	}

}
