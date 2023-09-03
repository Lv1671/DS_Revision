import java.util.*;
public class Main{
    public static Scannner scn = new Scanner(System.in);
    public static void main(String[] args){
        int n;
        int nspo = n /2;
        int nspi = -1;

        for(int i = 1; i <= n; i++){
            for(int cspo = 1; cspo <= nspo; cspo++){
                System.out.print(" ");
            }
            System.out.print("*");
            
            for(int cspi = 1; cspi <= nspi; cspi++){
                System.out.print(" ");
            }
            if( i <= n / 2){
                nspo--;
                nspi+=2;
            }else{
                nspo++;
                nspi-=2;
            }
        }
    }
}