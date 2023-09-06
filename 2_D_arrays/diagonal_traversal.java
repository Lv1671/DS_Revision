import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        int n = scn.nextInt();
        int m = scn.nextInt();
        int arr[][] = new int[n][m];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        for(int g = 0; g < arr.length; g++){
            for(int i = 0, j = g ; j < arr.length; i++ ,j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}