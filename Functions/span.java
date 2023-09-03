import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void span(int arr[]){
        int maxele = arr[0];
        int minele = arr[0];
        
        for(int i = 0; i < arr.length; i++){
            if(maxele < arr[i]){
                maxele = arr[i];
            }
            if(minele > arr[i]){
                minele = arr[i];
            }
        }
        System.out.println(maxele - minele);
    }
    
    public static void main(String[] args){
        int n = scn.nextInt();
        int [] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        span(arr);
    }
}