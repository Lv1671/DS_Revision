import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        int nst = 1;
        int n = scn.nextInt();
        for(int i = 1; i <= n; i++){
            for(int cst = 1; cst <= nst; cst++){
                System.out.print("*");
            }
            System.out.println("");
            nst++;
        }
    }
}