/*Write a program to sort a list of strings using multithreading. Create one of the threads that take a string as input from the user, another thread that sorts the strings and finally another thread that displays the sorted list of strings. Each of the input, sort, and display methods is to be synchronized.*/

public class Thread3 {
    public static void main(String[] args) {
        String arr[] = new String[5];
        Stringinput strI = new Stringinput(arr);
        StringSort strS = new StringSort(arr);
        Stringoutput strO = new Stringoutput(arr);
        strI.start();
        try {
            strI.join();
        } catch (InterruptedException e) {
        }
        strS.start();
        try {
            strS.join();
        } catch (InterruptedException e) {
        }
        strO.start();
    }
}
