/*4.Create a class with a private field and a private method. Create an inner class with a method
that modifies the outer class field and calls the outer class method. In a second outer class
method, create an object of the inner class and call it’s method, then show the effect on the
outer class object.*/

class outer{
    private int a=0;
    private void original(){
        System.out.println("Private methode called");
        System.out.println("original value of a is : "+a);
    }

    //inner class
    class inner{
            void modify1(){
                original(); // Call private method of outer class
                a=100; // Modify private field of outer class
                System.out.println("modifed value of a is : "+a);  
                
            }
    }

     // Method in outer class to use the inner class
    void access_inner(){
        inner i = new inner();
        i.modify1();
    }

}
public class innerclass2{
    public static void main(String[] args) {
        outer o = new outer();
        o.access_inner();
    }
}