package Basic;
/* Input: n = 13, m = 4
Output: 12
Explanation: 12 is the closest to 13, divisible by 4.

Input: n = -15, m = 6
Output: -18
Explanation: Both -12 and -18 are closest to -15, but -18 has the maximum absolute value. */
public class FindClosest {
    public static void main(String[] args) {
        int s = 15;
        int d = 6;
        int an = 0;
        for (int i = 0; i < s; i++) {
            for (int j = s; j >0 ; j--) {
                if(d * i == j) {
                    an = j;
                }
            }
        }
  System.out.println(an);

    }
}
