public class Stringoutput extends Thread {
    private String arr[];
    Stringoutput(String arr[]){
        this.arr=arr;
    }
    @Override
    public synchronized void run() {
        System.out.println("After sorting: ");
        for (String i : arr) {
            System.out.println(i);
        }
    }
}
