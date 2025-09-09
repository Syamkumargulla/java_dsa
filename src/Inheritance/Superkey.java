package Inheritance;
//this and super key
class a {
    public a(){
        super();
        System.out.println("A:");
    }

    public a(int n){
        super();
        System.out.println("int A");
    }
        }
class b extends a{
    public  b(){
        super();
        System.out.println("B:");
    }
    public  b(int n){
        super(n);
        System.out.println("b int");
    }


}


public class Superkey {
    public static void main(String[] args) {
        b obj = new b();
        b obj1 = new b(5);

    }
}
