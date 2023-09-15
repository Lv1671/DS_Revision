import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static boolean ispalindrome(String ss){
        int i = 0;
        int j = ss.length() - 1;
        while(i <= j){
            char ch1 = ss.charAt(i);
            char ch2 = ss.charAt(j);
            
            if(ch1 != ch2){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s = "abcc";
        for(int i = 0; i < s.length(); i++){
            for(int j = i + 1; j <= s.length(); j++){
                String ss = s.substring(i,j);
                if(ispalindrome(ss) == true){
                    System.out.println(ss);
                }
            }
        }
    }
}