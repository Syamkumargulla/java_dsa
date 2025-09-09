package Basic;
import java.util.*;

//revere list
public class PalinLIst {
    public static void main(String[] args) {
        String n = "madam";
        System.out.println(n + " ");
        List l1 = new ArrayList<>();
        for (char c:n.toCharArray()){
            l1.add(c);
        }
        List l2 = new ArrayList<>();
        for (char d:n.toCharArray()){
            l2.add(d);
        }
        Collections.reverse(l2);
            if(l1.equals(l2)){
                System.out.println("palindrom:" + n);

            }else {
                System.out.println("not a plalindrom:");
            }
            System.out.println(Arrays.toString(n.toCharArray()));
    }
}
