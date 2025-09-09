package Pattern;

public class Incrament {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}
