
import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        int f = factorial(n - 1);
        int fact = f * n;
        
        return fact;
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        System.out.println(factorial(n));
    }
}