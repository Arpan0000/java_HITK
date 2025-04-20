import java.util.*;

public class MaxMin
{
    static <T extends Comparable<T>> ArrayList<T> bsort(ArrayList<T> y)
    {
        ArrayList<T> x=new ArrayList<>(y);
        ArrayList<T> mn=new ArrayList<>();
        int n=x.size();
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if((x.get(j)).compareTo((x.get(j+1)))>0)
                {
                    T temp=x.get(j);
                    x.set(j,x.get(j+1));
                    x.set(j+1,temp);

                }
            }
        }
        mn.add(x.get(1));
        mn.add(x.get(n-2));
        return mn;

    }
    public static void main(String args[])
    {
        ArrayList<Integer> ai=new ArrayList<>();
        ai.add(5);
        ai.add(2);
        ai.add(9);
        ai.add(3);
        ArrayList<Integer> i= bsort(ai);
        System.out.println(i);
    }
}