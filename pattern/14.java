import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public staic void main(String[] args){
        int n = scn.nextInt();
        int nsp = 2;
        nst = 1;
        for(int i = 1; i <= n; i++){
            for(int csp = 1; csp <= nsp; csp++){
                System.out.print(" ");
            }
            for(int cst = 1; cst <= nst; cst++)
            System.out.print("*");

            if(i <= n/2){
                nsp--;
                nst+=2;
            }else{
                nsp++;
                nst-=2;
            }
        }
    }
}