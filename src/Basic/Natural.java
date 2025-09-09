package Basic;

public class Natural {
    public static void main(String[] args) {
        int n = 123;
        int ans = 0;
        while (n>0){
            int l = n % 10;
            ans = ans + l;
            n = n/10;
        }
        System.out.println(ans);
    }
}
