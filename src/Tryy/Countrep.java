package Tryy;

public class Countrep {
    public static void main(String[] args) {
        String str = "aabbccb";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.indexOf(ch) != -1) continue;

            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }
            result = result + ch + "" + count;
        }

        System.out.println(result);
    }
}
