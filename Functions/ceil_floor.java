import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        int [] arr = {10,20,30,40,50,60};
        int low = 0;
        int high = arr.length - 1;
        int ceil = 0, floor = 0;
        int data = 55; // data to be searched

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] > data){
                high = mid - 1;
                ceil = arr[mid];
            }else if(arr[mid] < data){
                low = mid + 1;
                floor = arr[mid];
            }else{
                ceil  = arr[mid];
                floor = arr[mid];
            }
        }
         System.out.println(ceil);
         System.out.println(floor);

    }
}