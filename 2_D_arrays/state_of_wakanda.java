import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        int n = scn.nextInt();
        int m = scn.nextInt();

        int [][] a = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = scn.nextInt();
            }
        }
        // printing
       for(int j = 0; j < m; j++){
        if( j % 2 == 0){
            for(int i = 0; i < n; i++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }else{
            for(int i = a.length - 1; i >= 0; i--){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

       }
    }
}