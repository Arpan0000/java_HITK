package day2_assig1_53;

import java.util.*;

class stack{
	int[] elements;
	int length;
	int top;
	
	stack(int size) {
        length = size;
        elements = new int[length];
        top = -1; 
    }
	void push(int ele) {
        if (top == length-1) {
        	System.out.println("Stack is full");
        }
        else {
            elements[++top] = ele;
            System.out.println("Pushed " + ele);
        }
    }
    
    void pop() {
    	if(top >= 0) {
    		System.out.println("poped element is" +elements[top--]);
    	}
    	else {
            System.out.println("Stack is empty");
    	}
    }
    void display() {
        if (top == -1)
            System.out.println("Stack is empty.");
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++)
            System.out.print(elements[i] + " ");
        System.out.println();
    }
    int size() {
    	return (top+1);
    }
}
public class Stack1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the lenth of the stack1");
		int n1=in.nextInt();
		stack s1 = new stack(n1);
        
		System.out.println("Enter the lenth of the stack2");
		int n2=in.nextInt();
		stack s2 = new stack(n2);
		
		System.out.println("Enter your choice: ");
		int choice;
		while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Push to Stack 1");
            System.out.println("2. Push to Stack 2");
            System.out.println("3. Pop from Stack 1");
            System.out.println("4. Pop from Stack 2");
            System.out.println("5. Display Stack 1");
            System.out.println("6. Display Stack 2");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
			choice = in.nextInt();
				
            switch (choice) {
            case 1:
                System.out.print("Enter value to push to Stack 1: ");
                int value1 = in.nextInt();
                s1.push(value1);
                break;
            case 2:
                System.out.print("Enter value to push to Stack 2: ");
                int value2 = in.nextInt();
                s2.push(value2);
                break;
            case 3:
                s1.pop();
                break;
            case 4:
                s2.pop();
                break;
            case 5:
                s1.display();
                break;
            case 6:
                s2.display();
                break;
            case 7:
                System.out.println("Exiting program.");
                return;
            default:
                System.out.println("Invalid choice!");
            }
            if((s1.size() == s2.size()) && s1.size() > 0) {
            	System.out.println("The stacks has exact same size");
            }
		}
	}
}