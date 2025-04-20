/*4.An educational institution wishes to maintain a database of its employees. The database is
divided into a number of classes whose hierarchical relationships are shown below. Write all
the classes and defines the methods to create the database and retrieve individual information
as and when needed.

    Write a driver program to test the classes.
        Staff (code, name)
        Teacher (subject, publication) is a Staff
        Officer (grade) is a Staff
        Typist (speed) is a Staff
        RegularTypist (remuneration) is a Typist
        CasualTypist (daily wages) is a Typist.
*/


abstract class Staff{
    int code;
    String name;
    Staff(int code,String name){
        this.code=code;
        this.name=name;
    }
    void showData(){
        System.out.println("The code of the Staff is : "+code);
        System.out.println("The name of the Staff is : "+name);
    }
}

class Teacher extends Staff{
    String subject,publication;
    Teacher(int code,String name,String subject,String publication){
        super(code, name);
        this.subject=subject;
        this.publication=publication;
    }
    void showData(){
        super.showData();
        System.out.println("The subject of the Teacher is : "+subject);
        System.out.println("The publication of the Teacher is : "+publication);
    }
}

class Officer extends Staff{
    String grade;
    Officer(int code,String name,String grade){
        super(code, name);
        this.grade=grade;
    }
    void showData()
    {
        super.showData();
        System.out.println("The subject of the Officer is : "+grade);
    }

}
//intermediate lvl
abstract class Typist extends Staff{
    int speed;
    Typist(int code,String name,int speed){
        super(code, name);
        this.speed=speed;
    }
    void showData(){
        super.showData();
        System.out.println("The subject of the Typist is : "+speed);
    }
}

class RegularTypist extends Typist{
    int remuneration;
    RegularTypist(int code,String name,int speed,int remuneration){
        super(code,name,speed);
        this.remuneration=remuneration;
    }
    void showData(){
        super.showData();
        System.out.println("The remuneration of the Regular Typist is: " + remuneration);
    }
}

class CasualTypist extends Typist {
    int dailyWages;

    CasualTypist(int code, String name, int speed, int dailyWages) {
        super(code, name, speed);
        this.dailyWages = dailyWages;
    }

    void showData() {
        super.showData();
        System.out.println("The daily wages of the Casual Typist is: " + dailyWages);
    }
}

public class inherit4 {
    public static void main(String[] args) {

        //upcasting
        Staff t1 = new Teacher(1, "A", "Mathematics", "ABCD");
        Staff o1 = new Officer(2, "B", "Senior");
        Staff r1 = new RegularTypist(3, "C", 80, 3000);
        Staff c1 = new CasualTypist(4, "D", 70, 1000);

        System.out.println("Employee Details:");
        t1.showData();
        System.out.println("------------------------------");
        o1.showData();
        System.out.println("------------------------------");
        r1.showData();
        System.out.println("------------------------------");
        c1.showData();
    }
}

