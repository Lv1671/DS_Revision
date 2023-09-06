import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        int n = scn.nextInt();
        int m = scn.nextInt();
        int arr[][] = new int[n][m];

        //input :
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        // transpose :
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr[i].length; j++){
                int temp  = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // swaping :
        for(int i = 0; i < arr.length; i++){
            int li = 0;
            int ri = arr[i].length - 1;
            while(li < ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;
                li++;
                ri--;
            } 
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}