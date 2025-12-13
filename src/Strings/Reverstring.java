package Strings;

public class Reverstring {
    public static void main(String[] args) {
        String str = "syam";
        StringBuilder sc = new StringBuilder(str);
        System.out.println(sc.reverse());

        String rev = " ";
        for (int i = str.length()-1; i >= 0 ; i--) {
            rev =  rev + str.charAt(i);
        }
        System.out.println(rev);
    }
}
