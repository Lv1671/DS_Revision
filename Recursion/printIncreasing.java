import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
   public static void printIncreasing(int n){
        if( n == 0)
       return;
    System.out.println(n);
    printIncreasing(n - 1);
    
   }
    public static void main(String[] args){
        int n = scn.nextInt();
        printIncreasing(n);
    }
}