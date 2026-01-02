package Strings;

import java.util.Arrays;

public class Anagram1 {
    public static void main(String[] args) {
        String str = "syam";
        String str1 = "Syam";
        char[] ch = str.toLowerCase().toCharArray();
        char[] ch1 = str1.toLowerCase().toCharArray();
        Sort(ch , 0 );
        Sort(ch1 , 0 );
        System.out.println(Arrays.equals(ch,ch1));
    }

    public static void Sort(char[] ch, int i) {
       int l = ch.length-1;
        while (i < l){
            char temp = ch[i];
            ch[i] = ch[l];
            ch[l] = temp;
            i++;
            l--;

        }


    }
}
