import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the size of array 1 :");
        int n1 = scn.nextInt();
        int [] a1 = new int[n1];
        for(int i = 0 ; i < n1; i++){
            a1[i] = scn.nextInt();
        }

        System.out.println("Enter the size of array2 :");
        int n2 = scn.nextInt();
        int[] a2 = new int[n2];

        for(int i = 0; i < n2; i++){
            a2[i] = scn.nextInt();
        }
        int [] sum = new int[n1 > n2 ? n1 : n2];
        int carry = 0;
        
        int i , j , k;

        i = a1.length  - 1;
        j = a2.length  - 1;
        k = sum.length - 1;

        while( k >= 0){
            int digit =  carry;
            if(i >= 0){
                digit+=a1[i];
            }

            if(j >= 0){
                digit+= a2[j];
            }
            carry = digit / 10;
            digit = digit % 10;
            sum[k] = digit;
            i--;
            j--;
            k--;
        }
        System.out.println(carry);
        for(int val : sum){
            System.out.println(val);
        }
    }
}