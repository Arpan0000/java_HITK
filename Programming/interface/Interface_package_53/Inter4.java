package Interface_package_53;
/*Create an interface Department containing attributes deptName and deptHead. It also
has abstract methods for getting data and printing the attributes. Create a class hostel
containing hostelName, hostelLocation and numberofRooms. The class contains methods
for getting and printing the attributes. Then write Student class extending the Hostel
class and implementing the Department interface. This class contains attributes
studentName, regdNo, electiveSubject and avgMarks. Write suitable getData and
printData methods for this class. Also implement the abstract methods of the Department
interface. Write a driver class to test the Student class. The program should be menu
driven containing the options:
i) Admit new student
ii) Migrate a student
iii) Display details of a student
For the third option a search is to be made on the basis of the entered registration number.*/

import java.util.*;

interface Department {

    String deptName="CS";
    String deptHead="SG";
    default String getDeptHead() {
        return deptHead;
    }
    default String getDeptName() {
        return deptName;
    }
}

class Hostel{
    String hostelName;
    String hostelLocation;
    int numberOfRooms;

    void getData(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Hostel Name: ");
        hostelName = in.nextLine();
        System.out.print("Enter Hostel Location: ");
        hostelLocation = in.nextLine();
        System.out.print("Enter Number of Rooms: ");
        numberOfRooms = in.nextInt();
    }

    public void printData() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Number of Rooms: " + numberOfRooms);
    }

}

class Student extends Hostel implements Department{
    String studentName;
    String regdNo;
    String electiveSubject;
    double avgMarks;

    public void getData() {
        super.getData(); 
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        studentName = in.nextLine();
        System.out.print("Enter Registration Number: ");
        regdNo = in.nextLine();
        System.out.print("Enter Elective Subject: ");
        electiveSubject = in.nextLine();
        System.out.print("Enter Average Marks: ");
        avgMarks = in.nextDouble();
    }

    public void printData() {
        super.printData(); // Printing hostel data
        System.out.println("Department Name: " + getDeptName());
        System.out.println("Department Head: " + getDeptHead());
        System.out.println("Student Name: " + studentName);
        System.out.println("Registration Number: " + regdNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);
    }
}


public class Inter4 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int MAX_STUDENTS = 100;
            Student[] students = new Student[MAX_STUDENTS];
            int studentCount = 0; // Tracks the current number of students
            int choice;
    
            do {
                System.out.println("\nMenu:");
                System.out.println("1. Admit new student");
                System.out.println("2. Migrate a student");
                System.out.println("3. Display details of a student");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = in.nextInt();
                in.nextLine(); // Consume newline character
    
                switch (choice) {
                    case 1:
                        if (studentCount < MAX_STUDENTS) {
                            Student newStudent = new Student();
                            newStudent.getData();
                            students[studentCount++] = newStudent;
                            System.out.println("Student admitted successfully!");
                        }
                        else {
                            System.out.println("No more students can be admitted. Maximum limit reached!");
                        }
                        break;
                    case 2:
                        System.out.print("Enter Registration Number of the student to migrate: ");
                        String regdToRemove = in.nextLine();
                        boolean removed = false;
                        for (int i = 0; i < studentCount; i++) {
                            if (students[i].regdNo.equals(regdToRemove)) {
                                // Shift elements to remove the student
                                for (int j = i; j < studentCount - 1; j++) {
                                    students[j] = students[j + 1];
                                }
                                students[--studentCount] = null; // Decrement count and nullify last entry
                                removed = true;
                                System.out.println("Student migrated successfully!");
                                break;
                            }
                        }
                        if (!removed) {
                            System.out.println("Student not found!");
                        }
                        break;

                    case 3:
                        System.out.print("Enter Registration Number of the student to display: ");
                        String regdToFind = in.nextLine();
                        boolean found = false;
                        for (int i = 0; i < studentCount; i++) {
                            if (students[i].regdNo.equals(regdToFind)) {
                                students[i].printData();
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Student not found!");
                        }
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } while (choice != 4);
        }
}