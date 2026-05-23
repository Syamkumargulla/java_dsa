package oops.Class;

class  calculator{
    void add(int a, int b){
        System.out.println(a + b);
    }
    void sub(int a, int b){
        System.out.println(a - b);
    }
    void Mult(int a, int b){
        System.out.println(a * b);
    }


}
public class Methodd {
    public static void main(String[] args) {
        calculator addd = new calculator();
        addd.add(2,3);
        addd.sub(3,4);
        addd.Mult(2,2);
    }
}
