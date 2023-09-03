import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        int n = scn.nextInt();
        int nst = n;
        int nsp = 0;

        for(int i = 1; i <= n; i++){
            for(int csp = 0; csp <= nsp; csp++){
                System.out.print(" ");
            }
            for(int cst = 0; cst <= nst; cst++){
                System.out.print("*");
            }
            System.out.println(""); 
            nst--;
            nsp++;
        }
    }
}