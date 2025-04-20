/*Write a Java program that illustrates the use of the yield( ), start( ),stop( ),run ( ), sleep( ),
wait( ) and isAlive( ) methods.*/
class MyThread extends Thread {
    String threadName;

    MyThread(String name) {
        threadName = name;
    }
    public void run(){
        try{
        Thread.sleep(1000);
        System.out.println(threadName+" Started");

        System.out.println(threadName + " yielding CPU");
        Thread.yield();
        
        synchronized (this) {
            System.out.println(threadName + " going to wait.");
            wait(2000);
            System.out.println(threadName + " resumed after wait.");
        }
        }
        catch(Exception e){
            System.out.println(threadName+" Interupt");
        }
        

    }
}

public class Thread1 {

    public static void main(String[] args) {
        MyThread t1 =  new MyThread("Thread 1");
        MyThread t2 =  new MyThread("Thread 2");
        t1.start();
        t2.start();

        try{
            Thread.sleep(500);
            System.out.println("Thread 1 is alive?(before any interupt) "+t1.isAlive());
            System.out.println("Thread 2 is alive?(before any interupt) "+t2.isAlive());

            Thread.sleep(1000);  
            t1.interrupt();  
            t2.interrupt(); 

            System.out.println("Thread 1 is alive after interrupt? " + t1.isAlive());
            System.out.println("Thread 2 is alive after interrupt? " + t2.isAlive());
            
        }
        catch(Exception e){
            System.out.println("Main thread interrupt");
        }
        System.out.println("Main thread ends");
    }
}