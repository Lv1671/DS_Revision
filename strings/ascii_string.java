import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static String diff(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < s.length(); i++){
           char ch  = s.charAt(i);
           char ch1 = s.charAt(i-1);
           
           int gap = ch - ch1;
           sb.append(gap);
           sb.append(ch1);
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String s = "abcdef";
        System.out.println(diff(s));
    }
}