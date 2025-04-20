/*1. Create a class called Time that has separate data member for hours, minutes and seconds.
Define member functions to perform the following tasks:
to display the time in the format hh: mm: ss.
to add times passed as arguments.
to check which among two times passed as arguments is greater.
Write a program to test the class and its functions. Use constructor to initialize the instance
variables of the class Time.*/

class Time {
    int hours;
    int  minutes;
    int seconds;

    Time(int hours,int minutes,int seconds){
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;
    }

    void addTime(Time t){
        this.hours+=t.hours;
        this.minutes+=t.minutes;
        this.seconds+=t.seconds;
        normalizeTime();
    }

    void compareTime(int hours,int minutes,int seconds){
        if(this.hours>hours)
            System.out.println("The previous time was greater :  "+this.hours+" : "+this.minutes+" : "+this.seconds);
        else if (this.hours<hours)
            System.out.println("The given time is greater  :  "+hours+" : "+minutes+" : "+seconds);
        else{
            if(this.minutes>minutes)
                System.out.println("The previous time was greater :  "+this.hours+" : "+this.minutes+" : "+this.seconds);
            else if (this.minutes<minutes)
                System.out.println("The given time is greater  :  "+hours+" : "+minutes+" : "+seconds);
            else{
                if(this.seconds>seconds)
                    System.out.println("The previous time was greater :  "+this.hours+" : "+this.minutes+" : "+this.seconds);
                else if (this.seconds<seconds)
                    System.out.println("The given time is greater  :  "+hours+" : "+minutes+" : "+seconds);
                else
                    System.out.println("The time are exactly equal");
            }
        }
    }
    void display(){
        System.out.println("The time now is : "+hours+" : "+minutes+" : "+seconds);
    }
    void normalizeTime() {
        if (seconds>60){
            minutes++;
            seconds-=60;
        }
        if (minutes>60){
            hours++;
            minutes-=60;
        }
    }
}

public class Timecal{
    public static void main(String args[]){
        Time t1= new Time(2,45,30);
        Time t2= new Time(5,40,59);

        System.out.print("Time 1: ");
        t1.display();
        System.out.print("Time 2: ");
        t2.display();

        t1.addTime(t2);
        System.out.print("Added Time: ");
        t1.display();

        t1.compareTime(2,40,30);
    }
}
