import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        int n = scn.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println(n + "x" + i "=" + n * i);
        }
    }
}