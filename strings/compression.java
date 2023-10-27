import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        String s = "aaabbbbccddeeeee";
        String ans = " "+ s.charAt(0);
        int count = 1;
        for(int i = 1; i < s.length(); i++){
            char curr = s.charAt(i);
            char prev = s.charAt(i - 1);
            if(curr == prev){
                count++;
            }else{
                if(count > 1){
                ans+=count;
                }
                ans+=curr;
                count = 1;
            }
        }
        if(count > 1)
        ans+=count;
        System.out.print(ans+" ");
    }
}