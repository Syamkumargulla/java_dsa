package oops;
//Exception Handling in Java (try–catch–finally)
public class Exceptionn {
    public static void main(String[] args) {
        try {
            int a = 10 / 2;
        } catch (ArithmeticException e) {
            System.out.println("Error");
        } finally {
            System.out.println("Always executed");
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
/*try {
        // risky code
        } catch(Exception e) {
        // handling code
        }

arithmetic Exception
public class Test {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }}}
4️⃣ Multiple catch Blocks
try {
    int[] a = new int[5];
    a[10] = 20;
} catch (ArithmeticException e) {
    System.out.println("Arithmetic error");
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Array index error");
}

try { 5️⃣ finally Block
    int a = 10 / 2;
} catch (Exception e) {
    System.out.println("Error");
} finally {
    System.out.println("Always executed");
}

        */
