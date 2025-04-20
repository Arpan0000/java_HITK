
interface Ops
{
    double operation(double a, double b);
}

public class Calculate 
{
    public static void main(String args[])
    {
        Ops add = (x,y)->x+y;
        Ops sub = (x,y)->x-y;
        Ops mul = (x,y)->x*y;
        Ops div = (x,y)-> y!=0 ? x/y : Double.NaN;

        double a=50.0,b=5.0;
        System.out.println(add.operation(a, b));
        System.out.println(sub.operation(a, b));
        System.out.println(mul.operation(a, b));
        System.out.println(div.operation(a, b));
    }
}
