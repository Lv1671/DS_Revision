import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        int n = scn.nextInt();
        int nsp = n - 1;
        int nst = 1;

        for(int i = 1 ; i <= n; i++){
            
            for(int csp = nsp; csp > 0; csp--){
                System.out.print(" ");
            }

            for(int cst = 1; cst <= nst; cst++){
                System.out.print("*");
            }
            System.out.println("");
            nsp--;
            nst++;
        }
    }
}