import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void reverse(int [] arr, int i , int j){
        int li = i;
        int ri = j;
        while(li < ri){
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;
            li++;
            ri--;
        }
    }
    public static void rotate(int arr[], int k){
        //first reverse
        reverse(arr, 0 , arr.length - k - 1);
        //Second reverse
        reverse(arr,arr.length - k , arr.length - 1);
        //full reverse
        reverse(arr,0,arr.length - 1);
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("enter the value of k :");
        int k = scn.nextInt();
        rotate(arr, k);
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
}