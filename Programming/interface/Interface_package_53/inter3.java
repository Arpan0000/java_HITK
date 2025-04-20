package Interface_package_53;
/*Create a private inner class that implements a public interface. Write a method that
returns a reference to an instance of the private inner class, up cast to the interface. Show
that the inner class is completely hidden by trying to downcast to it.*/

interface I1 {
    void show();
}

class OuterClass{
    private class InnerClass implements I1{
        public void show(){
            System.out.println("private class");
        }
    }
    public I1 innerobj() {
        InnerClass inner = new InnerClass();  // Create an instance of the private inner class
        return inner; // Return it upcasted to I1
    }
}


public class inter3 {
    public static void main(String[] args) {

        OuterClass outer = new OuterClass();

         // Upcasting:
        I1 i1 = outer.innerobj();

        //InnerClass i2=(InnerClass)I1;  //compile time error

        // Calling the show() method on the interface reference
        i1.show();
    }
}
