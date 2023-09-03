import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        //first array :
        int n = scn.nextInt();
        int m = scn.nextInt();
        int a[][] = new int[n][m];

        //taking input in first array :
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = scn.nextInt();
            }
        }
        // second array :
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int b[][] = new int[n1][m1];

        // taking input in second array :
        for(int k = 0; k < n1; k++){
            for(int l = 0; l < m1; l++){
                b[k][l] = scn.nextInt();
            }
        }
        // Now start Multiplying
        // first of all we have to check one condition :
        // row of first matrix is equal to column of another matrix
        int mult[][] = new int[n][m1];
        
            for(int p = 0; p < n; p++){
                for(int q = 0; q < m1; q++){
                    mult[p][q] = 0;

                    for(int r = 0; r < m; r++){
                        mult[p][q] += a[p][r] * b[r][q];
                    }
                    
                }
                
            }
            
            System.out.println("Output");
        for (int i = 0; i < mult.length; i++) {
            for (int j = 0; j < mult[i].length; j++) {
                System.out.print(mult[i][j] + " ");
            }
            System.out.println();

        }
    }
}