import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        int n = scn.nextInt();
        int a = 0, b = 1, c;
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= i; j++){
                System.out.print( a + " ");
                c = a + b;
                a = b;
                b = c;

            }
            System.out.println("");
        }
    }
}