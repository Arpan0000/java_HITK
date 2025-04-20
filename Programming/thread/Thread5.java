/*Create two Thread subclasses, one with a run( ) that starts up, captures the reference of the second Thread object and then calls wait( ). The other class’ run( ) should call notifyAll( ) for the first thread after some number of seconds have passed, so the first thread can print a message.*/


class Ref1 extends Thread{
    private Thread obj;
    String name;
    Ref1(Thread refobj2,String name){
        this.obj=refobj2;
        this.name=name;
    }
    @Override
    public void run() {
        
        synchronized(obj){
            System.out.println("Thread started "+name+" and waiting for notification");
            try {
                obj.wait();
            } catch(Exception e){System.out.println(name+" Interrupted while waiting");}
            System.out.println(name+" Received notification!");     
        }

    }
}

class Ref2 extends Thread{
    private String name;
    Ref2(String name){
        this.name=name;
    }
    @Override
    public void run() {
        System.out.println("Thread started "+name);
        try {
            Thread.sleep(3000);
        } catch (Exception e) {System.out.println(name+" Interrupted while waiting");}
        synchronized(this){
            System.out.println(name + " sending notification to waiting threads");
            this.notifyAll();
        }
        
    }
}

public class Thread5 {
    public static void main(String[] args) {
        Ref2 refobj2 = new Ref2("Thread2");
        Ref1 refobj1 = new Ref1(refobj2,"Thread1");
        refobj1.start();
        try {
            Thread.sleep(100);
        } catch (Exception e) {}
        refobj2.start();
    }
}
