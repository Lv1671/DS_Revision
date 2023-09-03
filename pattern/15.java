import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        int n = scn.nextInt();
        int nst = 1;
        int nsp = 2 * n - 3;

        for(int i = 1; i <= n; i++){
            int count = 1;

            for(int cst = 1; cst <= nst; cst++){
                System.out.print(count);
                count++;
            }
            
            for(int csp = 1; csp <= nsp; csp++){
                System.out.print(" ");
            }
            if(i == n){
                nst--;
                count--;
            }

            for(int cst = 1; cst <= nst; cst++){
                count--;
                System.out.print(count);
            }
            System.out.println("");
            nsp-=2;
            nst++;
        }
    }
}