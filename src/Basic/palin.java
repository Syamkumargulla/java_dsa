package Basic;

public class palin {
    public static void main(String[] args) {
        String n = "syam";
         n = n.toLowerCase();
         String rev = " ";
        for (int i = n.length()-1; i >=0 ; i--) {
              rev = rev + n.charAt(i);
        }
        if(n.equals(rev)){
            System.out.println("palindrom" + n);
        }else {
            System.out.println("notn a palindrom:" + n);
        }
    }
}
