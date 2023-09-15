import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("HelloWorld");
        System.out.println(sb);

        char ch = sb.charAt(0);
        System.out.println(ch);

        sb.setCharAt(0,'d');
        System.out.println(sb);
    }
}