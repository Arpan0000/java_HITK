/* Java program to demonstrate Upcasting Vs Downcasting*/

class Parent {                        // Parent class
	String name;
	// A method which prints the signature of the parent class
	void method()
	{
		System.out.println("Method from Parent");
	}
}

class Child extends Parent {         // Child class
	int id;

	// Overriding the parent method to print the signature of the child class
        void method()
	{
		System.out.println("Method from Child");
	}
}

// Demo class to see the difference between upcasting and downcasting
public class GFG {
	// Driver code
	public static void main(String[] args)
	{
		// Upcasting
		Parent p = new Parent();
		p.name = "GeeksforGeeks";

		//Printing the parentclass name
		System.out.println(p.name);
		//parent class method is overridden method hence this will be executed
		p.method();

		// Trying to Downcasting Implicitly
		// Child c = new Parent(); - > compile time error

		// Downcasting Explicitly
		Child c = (Child)p;

		c.id = 1;
		System.out.println(c.name);
		System.out.println(c.id);
		c.method();
		p.method();
	}
}