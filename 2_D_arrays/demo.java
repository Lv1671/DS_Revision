//In this program we will learn about :
// how to take input in 2d arrays.
// how to print 2d arrays.

import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        int n = scn.nextInt(); // enter the size of rows
        int m = scn.nextInt(); // enter the size of columns
        int a[][] = new int[n][m];//initialising the size of array

        //input
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = scn.nextInt();
            }
        }
        //printing
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println(""); // for new line
        }
    }
}