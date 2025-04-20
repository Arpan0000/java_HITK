import java.util.Scanner;

public class Stringinput extends Thread{

    private String arr[];
    Stringinput(String arr[]){
        this.arr=arr;
    }
    @Override
    public synchronized void  run() {
        Scanner in =new Scanner(System.in);
        for(int i =0;i<5;i++){
            System.out.println("Enter the number "+i+"String in the array");
            arr[i]=in.nextLine();
        }

    }
}
