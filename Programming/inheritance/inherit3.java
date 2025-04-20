/*3.Write a program to create a class named Vehicle having protected instance variables
regnNumber, speed, color, ownerName and a method showData ( ) to show “This is a vehicle
class”. Inherit the Vehicle class into subclasses named Bus and Car having individual private
instance variables routeNumber in Bus and manufacturerName in Car and both of them
having showData ( ) method showing all details of Bus and Car respectively with content of
the super class’s showData ( ) method.*/




abstract class Vehicle{
    protected int regnNumber;
    protected int speed;
    protected String color;
    protected String ownerName;
    Vehicle(int regnNumber,int speed,String color,String ownerName){
        this.regnNumber=regnNumber;
        this.speed=speed;
        this.color=color;
        this.ownerName=ownerName;
    }
    protected void showData(){
        System.out.println("This is a vehicle  class.");
        System.out.println("The Registration number of the Vechicle is:  "+regnNumber);
        System.out.println("The Maximum speed of the Vechicle is:  "+speed);
        System.out.println("The Color of the Vechicle is:  "+color);
        System.out.println("The Owner name of the Vechicle is:  "+ownerName);
    }
}

class Bus extends Vehicle{
    private int routeNumber;
    Bus(int r,int s,String c,String o,int routeNumber){
        super(r, s, c, o);
        this.routeNumber=routeNumber;
    }
    public void showData(){
        super.showData();
        System.out.println("The route number of the Bus is:  "+routeNumber);
    }
}

class Car extends Vehicle{
    private String manufacturerName;
    Car(int r,int s,String c,String o,String manufacturerName){
        super(r, s, c, o);
        this.manufacturerName=manufacturerName;
    }
    public void showData(){
        super.showData();
        System.out.println("The route number of the Car is:  "+manufacturerName);
    }

}
public class inherit3 {
    public static void main(String[] args) {
        //upcasted obj
        Vehicle b1=new Bus(1, 40, "BLUE", "Mr.Singh", 24);
        Vehicle c1=new Car(2, 100, "WHITE", "Mr.Das", "Hundai");
        b1.showData();
        System.out.println("---------------------------------------");
        c1.showData();
    }
}
