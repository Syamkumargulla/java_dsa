package Strings;

public class Sorting {
    public static void main(String[] args) {
        String str = "syam ";
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <str.length() ; j++) {
                if(ch[i] > ch[j]){
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        String ss = new String(ch);
        System.out.println(ss);
    }
}
