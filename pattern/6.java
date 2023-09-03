import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        int n = scn.nextInt();
        int nst = 3;
        int nsp = 1;

        for(int i = 1; i <= n; i++){
            for(int cst = 1; cst <= nst; cst++){
                System.out.print("*");
            }

            for(int csp = 1; csp <= nsp; csp++){
                System.out.print(" ");
            }

            for(int cst = 1; cst <= nst; cst++){
                System.out.print("*");
            }
            System.out.println("");
            if(i <= n/2)
            {
                nsp+=2;
                nst--;
            }else{
                nsp-=2;
                nst++;
            }
        }
        
    }
}