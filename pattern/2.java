import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        int n = scn.nextInt();
        int nst =  n;
        for(int i = 1; i <= n; i++){
            for(int cst = nst ; cst >=1; cst--){
                System.out.print("*");
            }
            System.out.println("");
            nst--;
        }
    }
}