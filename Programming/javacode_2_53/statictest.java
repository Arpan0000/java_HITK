/*3. Write a program that defines a class with one static variable called cnt. Create two or more
objects of the class. The class also contains a method that increments the cnt variable
whenever a new instance of the class is created. Write a driver class to test the above class.*/


class test{
    static int cnt=0;
    test(){cnt++;}
    
    void display(){
        System.out.println("cnt value is: "+cnt);
    }
}
public class statictest {

    public static void main(String[] args) {
        test t1=new test();
        t1.display();
        test t2=new test();
        t2.display();
        test t3=new test();
        t3.display();

    }
}