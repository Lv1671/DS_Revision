import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
   public static void printDeccreasing(int n){
        if( n == 0)
       return;
    printDecreasing(n - 1);
    System.out.println(n);
   }
    public static void main(String[] args){
        int n = scn.nextInt();
        printDeccreasing(n);
    }
}