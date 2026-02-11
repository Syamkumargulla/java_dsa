package Strings;

import java.util.Arrays;

public class Plaind {
    public static void main(String[] args) {
        String str = "syamkumar"; //s1y1a1m1
        int count = 1;
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        for (char i = 1; i <= ch.length-1; i++) {
            if(ch[i] == ch[i-1]){
                count ++;
            }else {
                System.out.print(ch[i-1] +""+ count);
                count = 1;
            }
        }

    }
}
