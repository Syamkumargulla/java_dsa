package Basic;

public class Palindrome {
    public static void main(String[] args) {
        int n = 1231;
        int org = n ;
        int rev = 0;
        while (n != 0){
            int lastDigit = n%10;
            rev = rev*10 + lastDigit;
            n= n/10;
        }
        if(org == rev) {
            System.out.println(" it is palindrom:" + org);
        }else System.out.println("not a palindrom:");
    }
}
