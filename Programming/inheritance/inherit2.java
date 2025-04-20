/*Create a general class ThreeDObject and derive the classes Box, Cube, Cylinder and Cone
from it. The class ThreeDObject has methods wholeSurfaceArea ( ) and volume ( ). Override
these two methods in each of the derived classes to calculate the volume and whole surface
area of each type of three-dimensional objects. The dimensions of the objects are to be taken
from the users and passed through the respective constructors of each derived class. Write a
main method to test these classes.*/

abstract class ThreeDObject {
    abstract double wholeSurfaceArea();
    abstract double volume();
}

class Box extends ThreeDObject {
    double length, width, height;

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double wholeSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    double volume() {
        return length * width * height;
    }
}

class Cube extends ThreeDObject{
    double side;

    Cube(double side) {
        this.side = side;
    }

    double wholeSurfaceArea() {
        return 6 * side * side; 
    }

    double volume() {
        return side * side * side; 
    }
}

class Cylinder extends ThreeDObject {
    private double radius, height;
    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    double volume() {
        return Math.PI * radius * radius * height;
    }
}

class Cone extends ThreeDObject{
    double radius, height;
    Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double wholeSurfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight); 
    }
    public double volume() {
        return (1.0 / 3) * Math.PI * radius * radius * height; 
    }
}


public class inherit2 {
    public static void main(String[] args) {
        Box box=new Box(2,4,3);
        System.out.println("Surface area of the Box : "+box.wholeSurfaceArea());
        System.out.println();
        System.out.println("Volume of the Box : "+box.volume());
        
        Cube cube=new Cube(4);
        System.out.println("Surface area of the Cube : "+cube.wholeSurfaceArea());
        System.out.println();
        System.out.println("Volume of the Cube : "+cube.volume());
        
        Cone cone=new Cone(3, 4);
        System.out.println("Surface area of the Cone : "+cone.wholeSurfaceArea());
        System.out.println();
        System.out.println("Volume of the Cone : "+cone.volume());

        Cylinder cylinder=new Cylinder(2, 3);
        System.out.println("Surface area of the Cylinder : "+cylinder.wholeSurfaceArea());
        System.out.println();
        System.out.println("Volume of the Cylinder : "+cylinder.volume());

    }
}