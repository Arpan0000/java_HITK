/*Create three interfaces, each with two methods. Inherit a new interface from the three,
adding a new method. Create a class by implementing the new interface and also
inheriting from a concrete class. Now write four methods, each of which takes one of the
four interfaces as an argument. In main( ), create an object of your class and pass it to
each of the methods.*/


package Interface_package_53;

interface InnerInter1 {
    void a();
    void b();
}
interface InnerInter2 {
    void c();
    void d();
}
interface InnerInter3 {
    void e();
    void f();
}
interface OuterInter extends InnerInter1,InnerInter2,InnerInter3{
    void unique();
}
class Concrete{
    void display(){System.out.println("This is concrete class");}
}

class AllClassAndInterface extends Concrete implements OuterInter{
    public void a() {
        System.out.println("Method a() from InnerInter1");
    }
    public void b() {
        System.out.println("Method b() from InnerInter1");
    }
    public void c() {
        System.out.println("Method c() from InnerInter2");
    }
    public void d() {
        System.out.println("Method d() from InnerInter2");
    }
    public void e() {
        System.out.println("Method e() from InnerInter3");
    }
    public void f() {
        System.out.println("Method f() from InnerInter3");
    }
    public void unique() {
        System.out.println("Unique method from OuterInter");
    }

/*methods which will pass each interface one by one */
    public void method1(InnerInter1 obj) {
        obj.a();
        obj.b();
    }

    public void method2(InnerInter2 obj) {
        obj.c();
        obj.d();
    }

    public void method3(InnerInter3 obj) {
        obj.e();
        obj.f();
    }

    public void method4(OuterInter obj) {
        obj.a();
        obj.b();
        obj.c();
        obj.d();
        obj.e();
        obj.f();
        obj.unique();// personal method of outerinterface
    }
}

public class Inter1 {
    public static void main(String[] args) {
        AllClassAndInterface obj =new AllClassAndInterface();// general object
        obj.method1(obj);
        obj.method2(obj);
        obj.method3(obj);
        obj.method4(obj);
    }
}
