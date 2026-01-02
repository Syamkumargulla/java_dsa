package Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str = "Syam";
        String str1 = "Syam" ;
        if(str1.length() != str.length()) {
            System.out.println(false + " okay bye");
        }else {

            // System.out.println(str1.equals(str));
            char[] ch = str.toCharArray();
            char[] ch1 = str1.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch);
            // System.out.println(new String (ch).equals(new String(ch1)));
            System.out.println(Arrays.equals(ch, ch1));
        }
    }
}
