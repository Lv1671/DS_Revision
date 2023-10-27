import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        String s = "LakSHAy";
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                char uch = (char) ('A' + ch - 'a');
                sb.setCharAt(i, uch);
            } else if (ch >= 'A' && ch <= 'Z') {
                char lch = (char) ('a' + ch - 'A');
                sb.setCharAt(i, lch);
            }
        }

        System.out.println(sb);
    }
}
