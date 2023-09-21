import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int linear(int n , int pow){
        if(pow == 0)
        return 1;
        
        int pown1 = linear(n,pow -1);
        int pow1  = pown1 * n;
        
        return pow1;
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        int pow = scn.nextInt();
        int ans =  linear(n,pow);
        System.out.println(ans);
    }
}