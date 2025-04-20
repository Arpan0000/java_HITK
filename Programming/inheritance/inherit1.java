/*Write an inheritance hierarchy for classes Quadrilateral, Trapezoid, Parallelogram, Rectangle
and Square. Use Quadrilateral as the super class of the hierarchy. Specify the instance
variables and methods for each class. The private instance variables of Quadrilateral should
be the x-y coordinate pairs for the four endpoints of the Quadrilateral. Write a program that
instantiates objects of your classes and outputs each object's area (except Quadrilateral).*/


class Quadrilateral{
    private int x1,y1,x2,y2,x3,y3,x4,y4;
    Quadrilateral(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        this.x3=x3;
        this.y3=y3;
        this.x4=x4;
        this.y4=y4;
    }
    double distance(int a1, int b1, int a2, int b2) {
        return Math.sqrt(Math.pow((a2 - a1), 2) + Math.pow((b2 - b1), 2));
    }

    int[] coordinate() {
        return new int[]{x1, y1, x2, y2, x3, y3, x4, y4};
    }
}

class Trapezoid extends Quadrilateral{
    
    double base1,base2,height;
    Trapezoid(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, double height) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        this.height = height;
        int[] arr = coordinate();
        base1 = distance(arr[0], arr[1], arr[2], arr[3]); // Length of base1
        base2 = distance(arr[4], arr[5], arr[6], arr[7]); // Length of base2
    }

    double area(){
        return (base1 + base2) * height / 2;
    }
}


class Parallelogram extends Quadrilateral{
    double base, height;
    Parallelogram(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, double height) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        this.height = height;
        int[] arr = coordinate();
        base = distance(arr[0], arr[1], arr[2], arr[3]); // Length of base
    }
    double area() {
        return base * height;
    }
}

class Rectangle extends Quadrilateral{
    double l,b;
    Rectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        int[] arr = coordinate();
        l = distance(arr[0], arr[1], arr[2], arr[3]); // Length
        b = distance(arr[0], arr[1], arr[4], arr[5]); // Breadth
    }

    double area(){
        return l*b;
    }
}

class Square extends Quadrilateral{
    double side;
    Square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        int[] arr = coordinate();
        side = distance(arr[0], arr[1], arr[2], arr[3]);
    }
    double area(){
        return side*side;
    }
}
public class inherit1{
    public static void main(String args[]){

        Trapezoid trapezoid=new Trapezoid(0, 0, 4, 0, 3, 3, 1, 3,2);
        System.out.println("Area of the Trapezoid: " + trapezoid.area());
        Rectangle rectangle=new Rectangle(0, 0, 4, 0, 3, 3, 1, 3);
        System.out.println("Area of the rectangle: " + rectangle.area());
        Parallelogram parallelogram=new Parallelogram(0, 0, 4, 0, 3, 3, 1, 3,2);
        System.out.println("Area of the pallelogram: " + parallelogram.area());
        Square square=new Square(0, 0, 4, 0, 3, 3, 1, 3);
        System.out.println("Area of the square: " +square.area());
    }
}