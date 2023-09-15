public class Main {
    public static void main(String[] args) {
        String s = "aaaabbcdddeeee";
        int count = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i + 1);

            if (ch1 == ch2) {
                count++;
            } else {
                System.out.print(ch1);
                if (count > 1) {
                    System.out.print(count);
                }
                count = 1;
            }
        }

        // Print the last character and its count
        //System.out.print(s.charAt(s.length() - 1));
        //if (count > 1) {
          //  System.out.print(count);
        //}
    }
}
