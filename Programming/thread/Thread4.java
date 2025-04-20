/*Inherit a class from Thread and override the run( ) method. Inside run( ), print a message,and then call sleep( ). Repeat this three times, then return from run( ). Put a start-upmessage in the constructor and override finalize( ) to print a shut-down message. Make a separate thread class that calls System.gc( ) and System. runFinalization( ) inside run( ),printing a message as it does so. Make several thread objects of both types and run them to see what happens. */

class C1 extends Thread{

    C1(int ThreadName){
        System.out.println("<-------- The thread "+ThreadName+" is started ------->");
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.err.println("Hello messaage "+i+": ");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}
        }
    }
    /*the finalize() method has been deprecated in Java since Java 9.*/
    protected synchronized void finalize() {   
        System.out.println("Shutdown thread ");
    }
}

class C2 extends Thread{

    C2(int x){
        System.out.println("The garage thread number "+x+" is runnning");
    }
    @Override
    public synchronized void run() {
        System.out.println("The garbage collection and finalization method are called");
        System.gc();
        System.runFinalization();//depreceated
    }
}


public class Thread4 {
    public static void main(String[] args) {
        for (int i=0 ;i<5; i++) {
            C1 MyThread = new C1(i);
            C2 MyThread2=new C2(i);
            MyThread.start();
            MyThread2.start();
        }
    }
}
/*cannot understand the output */