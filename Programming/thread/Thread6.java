/*6.Suppose that two threads “t1” and “t2” access a shared integer “x”. Thread “t1”
indefinitely increases “x” and “t2” indefinitely prints the value of “x”. That is the threads run in an infinite loop. However, thread “t1” must not increase “x” till that value of “x” is printed by “t2” and “t2” must not print the same value of “x” more than once. 
                            AND
                            
7. Define the classes for implementing “t1” and “t2”. Write appropriate methods for
accomplishing the above.*/

class Counter{
    private int x=0;
    synchronized void increment(){x++;}
    void getcount(){System.out.println("The count of x is : "+x);};
}

class CounterThread extends Thread{
    private Counter counter;
    CounterThread(Counter counter){this.counter=counter;}
    @Override
    public void run() {
        for(;;){
            counter.increment();
            try {
                sleep(10);
            } catch (Exception e) {}
        }
    }
}

class PrintThread extends Thread{
    private Counter counter;
    PrintThread(Counter counter){this.counter=counter;}
    @Override
    public void run() {
        for(;;){
            counter.getcount();
            try {
                sleep(10);
            } catch (Exception e) {}
        }
    }
}

public class Thread6 {
    public static void main(String[] args) {
        Counter counter=new Counter();
        CounterThread t1= new CounterThread(counter);
        PrintThread t2=new PrintThread(counter);
        t1.start();
        t2.start();
    }
}
