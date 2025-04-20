

public class MultiThreadThing extends Thread{

    private String name;
    public MultiThreadThing(String name){
        this.name=name;
    }

    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println(i+"no. loop From Thread : "+name);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
        }
    }
}
