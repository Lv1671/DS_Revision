import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void find(int arr[], int d){
        for(int i = 0; i < arr.length; i++){
            if(d == arr[i]){
            System.out.println(i);
            return;
            }
            
        }
        System.out.println(-1);
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        int [] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        find(arr, d);
    }
}