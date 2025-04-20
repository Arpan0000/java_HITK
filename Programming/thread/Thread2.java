/*Write multithreaded program that continuously prints the strings “ping” and “PONG” in
the console at random distances at intervals of one second. Use two threads one for
“ping” and another for “PONG”. */


public class Thread2 {

    public static void main(String[] args) {
        String arr[]={"ping","pong"};
        for (String str : arr) {
            MultiThreadThing MyThing =new MultiThreadThing(str);
            MyThing.start();
        }
        //System.out.println(Thread.currentThread().getName());
        
    }
}