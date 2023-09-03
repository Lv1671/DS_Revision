import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void input(int arr[]){
      for(int i = 0; i < arr.length; i++)
      arr[i] = scn.nextInt();
    }
    public static void main(String[] args){
        System.out.println("Enter the size of array 1");
        int n1 = scn.nextInt();
        int [] a1 = new int[n1];
        System.out.println("Enter the elements in array 1");
        input(a1);
        
        
        System.out.println("Enter the size of array 2");
        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        System.out.println("Enter the elements in array 2");
        input(a2);
        
        // we are assuming a2 is greatest
        int [] diff = new int[n2];
        int i , j , k;
        i = a1.length- 1;
        j = a2.length- 1;
        k = diff.length- 1;
        int carry = 0;
        while(k >= 0){
            int a1l = i >= 0 ? a1[i] : 0;
            int digit = 0;
            if(a2[j] + carry >= a1l){
              digit =  a2[j] + carry - a1l;
              carry = 0;
            }else{
                digit = a2[j]+ carry + 10 - a1l;
                carry = -1;
            }
            diff[k] = digit;
            i--; j--; k--;
            
        }
        for(int val : diff)
        System.out.println(val);
    }
}