/*Create an interface with at least one method, in its own package. Create a class in a
separate package. Add a protected inner class that implements the interface. In a third
package, inherit from your class and, inside a method, return an object of the protected
inner class, up casting to the interface during the return.*/


package Interface_package_53;
import Implement_in_class_53.*;
import Interface_create_53.I;
class ThirdClass extends A {
    public I show() {
        InnerClass i = new InnerClass(); 
        return i; 
    }
}

public class Inter2 {

    public static void main(String[] args) {
        // Create obj of ThirdClass
        ThirdClass T3 = new ThirdClass();
        
        // upcasted object
        I innerA = T3.show();
        
        // Call the method1() on the interface instance
        innerA.method1(); 
    }
    
}
