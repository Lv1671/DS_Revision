import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static String toggleCase(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < sb.length(); i++){
            char ch = sb.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                char uch = (char)('A' + ch -'a');
                sb.setCharAt(i,uch);
            }else if(ch >= 'A' && ch <= 'Z'){
                char lch = (char)('a' + ch -'A');
                sb.setCharAt(i, lch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String s  = "pePcoDing";
        System.out.println(toggleCase(s));
    }
}