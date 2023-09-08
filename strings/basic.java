import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        String s1 = "hello";
        String s2 = "world";
        System.out.println( s1 +" "+ s2);

        //****************** User Input ******************************************** 
       // String s3 = scn.next(); // it reads till only the spacebar
        //String s4 = scn.next();// abc def ----> it reads only abc till the spacebar

        //System.out.println(s3);
        //System.out.println(s4);

        //==============Another input method ===========================================

        //String s5 = scn.nextLine(); // it reads after the spacebar as well
       // String s6 = scn.nextLine();// abc def ---> it reads the complete line

        //System.out.println(s5);
        //System.out.println(s6);

        //=============== Functions of Strings =========================================
        //s.length() -> returns the length of string
        //s.charAt() -> it returns the value from character array
        String s8 = "Lakshay";
        System.out.println(s8.length());
        char ch = s8.charAt(0);
        System.out.println(ch);

        for(int i = 0; i < s8.length(); i++){
            char ch1 = s8.charAt(i);
            System.out.println(ch1);
        }
        //=============Addition of two substrings ===========================================
        String s10 = "Hello1";
        s10+='0';
        String s11 = "World1";
        String s12 = s10 + s11;
        System.out.println(s12);
        //===========conceptual question ====================================================
        System.out.println("hello"+ 10 + 20);//String evaluate from left to right so output should be hello1020
        System.out.println(10 + 20 + "hello");// As we know it evaluating from left to right so output should be 30hello

        //============ Split Function ========================================================
        String sp = "abc def ghi jkl mno pqr stu";
        String [] parts = sp.split(" ");
        for ( int i=0 ; i<parts.length ; i++ ){
            System.out.println(parts[i]);

        }
        //========= Equals & == =============================================================
        String a  = "hello";
        String b  = "hello";
        String c  = new String("hello");
        if( a == b){
            System.out.println("True: because it checks only the address");
        }
        if(a==c) {
            System.out.println("False: because it checks only the address");
        }
        // Now we are Using equals function :
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
    }
}