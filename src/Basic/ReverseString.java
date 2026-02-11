package Basic;

public class ReverseString {
    public static void main(String[] args) {

        String n = "MadaM";
        StringBuilder n1 = new StringBuilder(n);
        n1.reverse();
        String rev = " ";
        System.out.println(n1);
        for(int i = n.length()-1; i>=0; i--){
            rev = rev + n.charAt(i);
        }
        System.out.println(rev);
        System.out.print(n.equals(n1.toString()));
    }
}
