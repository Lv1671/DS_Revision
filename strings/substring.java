import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        String s1 = "abcde";
        for(int i = 0;  i < s1.length(); i++){
            for(int j = i + 1 ; j <=s1.length(); j++)
            System.out.println(s1.substring(i,j));
        }
    }
}