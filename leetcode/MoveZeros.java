
import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        int arr [] = {0,1,3,0,12,0,7,0,9};
        int i = 0;
        int j = 0;
        
        while( j < arr.length){
            
            if(arr[j] != 0 && arr[i] == 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            if(arr[i] != 0){
                i++;
            }
            j++;
        }
        
        for(int val : arr){
            System.out.println(val);
        }
    }
}