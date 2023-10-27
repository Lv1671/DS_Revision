//longest Palidromic substring:
import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static String lps(String s1){
        if(s1.length() <= 1){
            return s1;
        }
        
        String lps1 = "";
        for(int i = 0; i < s1.length (); i++){
            int low = i;
            int high = i;
            
            while( low > -1 && high < s1.length ()){
                if(s1.charAt(low) == s1.charAt(high)){
                    low--;
                    high++;
                }else{
                    break;
                }
            }
            String palindrome = s1.substring(low+ 1, high);
            if(palindrome.length () > lps1.length()){
                lps1 = palindrome;
            }
            
            //For even length :
            low = i - 1;
            high = i;
            while( low > -1 && high < s1.length ()){
                if(s1.charAt(low) == s1.charAt(high)){
                    low--;
                    high++;
                }else{
                    break;
                }
            }
             palindrome = s1.substring(low+ 1, high);
            if(palindrome.length () > lps1.length()){
                lps1 = palindrome;
            }
        }
        return lps1;
        
    }
    public static void main(String[] args){
        String s1 = "noon";
        String ans = lps(s1);
        
        System.out.println(ans);
    }
}