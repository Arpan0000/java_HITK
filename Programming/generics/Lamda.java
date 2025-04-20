
import java.util.function.Predicate;

public class Lamda 
{
    public static void main(String args[])
    {
        Predicate<Integer> isOdd = x->x%2!=0;

        Predicate<Integer> isPrime = x -> {
            if(x<=1){
                return false;
            }
            for(int i=2;i<Math.sqrt(x);i++){
                if(x%i==0){
                    return false;
                }
            }
            return true;
        };

        Predicate<Integer> isPalindrome = x -> {
            int y=x,s=0;
            while(x>0){
                int r=x%10;
                s=s*10+r;
                x=x/10;
            }
            if(s==y)
                return true;
            else 
                return false;
            };


        System.out.println( isOdd.test(123));
        System.out.println(isPrime.test(29));
        System.out.println(isPalindrome.test(121));
    }
    
}
