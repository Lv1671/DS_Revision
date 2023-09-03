import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void digitFrequency(int n, int x ){
        int count = 0;
        while(n != 0){
            int rem = n % 10;
            if(rem == x){
                count++;
            }
            n/=10;
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        int x = scn.nextInt();
        digitFrequency(n , x);
    }
}