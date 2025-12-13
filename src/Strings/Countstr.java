package Strings;

public class Countstr {
    public static void main(String[] args) {
        String str = "syam";
        int num = 1234;
        int c = 0;
        int count =0;
        for (int i = 0; i <str.length(); i++) {
            count ++;
        }

        while(num>0){
          //  int l = num % 10;
            c++;
            num = num/10;
        }
        System.out.println(count + " " + c);
    }
}
