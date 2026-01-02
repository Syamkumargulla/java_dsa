package Basic;

public class PalinStringbuilder {
    public static void main(String[] args) {
        String n = "syam";
        StringBuilder n1 = new StringBuilder(n);
        n1.reverse();

        if(n.equals(n1.toString())){
            System.out.println("palin with Stringbuilder :" + n);
        }else {
            System.out.println("not");
        }

    }
}
