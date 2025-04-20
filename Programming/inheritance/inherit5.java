/*5. Consider an example of book shop which sells books & video tapes. It’s modeled by Book &
Tape classes. These two classes are inherited from the abstract class called Media. The Media
class has common data members such as title & publication. The Book class has data
member for storing a no. of pages in a book & Tape class has the playing time in a tape. Each
class will have method such as read ( ) & show ( ). Write a program that models this class
hierarchy & processes objects using reference to base class only.*/

abstract class Media{
    String title,publication;
    Media(String title,String publication){
        this.title=title;
        this.publication=publication;
    }
    abstract void read();
    void show(){
        System.out.println("The Title is  : "+title);
        System.out.println("The Publication is  : "+publication);
    }
}
class Book extends Media{
    int noOfPages;
    Book(String title,String publication,int noOfPages){
        super(title, publication);
        this.noOfPages=noOfPages;
    }
    void read(){
        System.out.println("Reading book ----->   "+title);
    }
    void show(){
        super.show();
        System.out.println("The no. of pages are : "+noOfPages);
    }
}

class Tape extends Media{
    double playingTime;
    Tape(String title,String publication,double playingTime){
        super(title, publication);
        this.playingTime=playingTime;
    }

    void read(){
        System.out.println("Playing Tape ------>  "+title);
    }
    void show(){
        super.show();
        System.out.println("The no. of pages are : "+playingTime+" mins");
    }
}

public class inherit5 {
    public static void main(String[] args) {
        Media[] items = new Media[4];
        items[0] = new Book("Java Programming", "A", 450);
        items[1] = new Tape("Introduction to Java", "B", 90.20);
        items[2] = new Book("Data Structures", "C", 300);
        items[3] = new Tape("Algorithms Made Easy", "D", 120.50);


        for (Media item : items) {
            item.read();
            item.show();
            System.out.println("--------------------------------------------");
        }
    }
}
