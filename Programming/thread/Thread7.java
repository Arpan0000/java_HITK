/*8. Write a program, which will create a deadlock.*/


class Req1 extends Thread{
    private String name;
    private Object obj1,obj2;
    Req1(Object obj1, Object obj2, String name){
        this.name=name;
        this.obj1=obj1;
        this.obj2=obj2;
    }

    @Override
    public void run() {
        synchronized(obj1){
            System.out.println(name+" : Holding obj 1");

            try {
                Thread.sleep(1000);
            } catch (Exception e) {}

            System.out.println(name+" waiting for obj 2");

            synchronized(obj2){
                System.out.println(name+" got obj1 and obj 2");
            }
        }
    }
}

class Req2 extends Thread{
    private String name;
    private Object obj1,obj2;
    Req2(Object obj1, Object obj2, String name){
        this.name=name;
        this.obj1=obj1;
        this.obj2=obj2;
    }

    @Override
    public void run() {
        synchronized(obj2){
            System.out.println(name+" : Holding obj 2");

            try {
                Thread.sleep(1000);
            } catch (Exception e) {}

            System.out.println(name+" waiting for obj 1");

            synchronized(obj1){
                System.out.println(name+" got obj2 and obj 1");
            }
        }
    }
}


public class Thread7 {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object(); 

        Req1 r1 = new Req1(obj1, obj2, "Thread1");
        Req2 r2 = new Req2(obj1, obj2, "Thread2");
        
        r1.start();
        r2.start();
    }
}
