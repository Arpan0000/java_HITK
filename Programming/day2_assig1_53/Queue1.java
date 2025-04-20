package day2_assig1_53;

import java.util.*;


class queue{
	int[] elements;
	int length;
	int start;
	int end;
	
	queue(int size){
		length =size;
		elements=new int[length];
		start=end=-1;
	}
	
	void isEmpty() {
		if (start == -1)
			System.out.println("Underflow / Queue is empty");
		else
			System.out.println("Continue");
	}
	
	void isFull() {
		if (start == 0 && end == length-1)
			System.out.println("Overflow / Queue is full");
		else
			System.out.println("Continue");
	}
	
	void Enqueue(int ele) {
		if(end == length-1)
			System.out.println("Overflow / Queue is full");
		else {
			elements[++end]=ele;
			System.out.println("Element "+ele+" added ");
		}
	}
	
	void dequeue() {
		if (start > end)
			System.out.println("Underflow / Queue is empty");
		else {
			
			if(start == -1)
				start=0;	
			System.out.println("Dequeue element is" +elements[start]);
			for (int i=0; i<= end-1; i++)
				elements[i]=elements[i+1];
			
			end--;
		}
	}
	
	void display() {
        if (start == -1) 
            System.out.println("Queue is empty.");
        
        System.out.print("Queue elements are : ");
        for (int i = 0; i <= end; i++)
            System.out.print(elements[i] + " ");
        System.out.println();
    }
}
public class Queue1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the lenth of the queue");
		int n=in.nextInt();
		queue q1 = new queue(n);
		
		
		System.out.println("Enter your choice: ");
		int choice;
		while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Enqueue to Queue");
            System.out.println("2. Dequeue to Queue");
            System.out.println("3. Underflow checking");
            System.out.println("4. Overflow checking");
            System.out.println("5. Display queue");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
			choice = in.nextInt();
				
            switch (choice) {
            case 1:
                System.out.print("Enter value to Enqueue: ");
                int value = in.nextInt();
                q1.Enqueue(value);
                break;
            case 2:
                q1.dequeue();
                break;
            case 3:
                q1.isEmpty();
                break;
            case 4:
                q1.isFull();
                break;
            case 5:
                q1.display();
                break;
            case 6:
                System.out.println("Exiting program.");
                return;
            default:
                System.out.println("Invalid choice!");
            }
		}

	}

}
