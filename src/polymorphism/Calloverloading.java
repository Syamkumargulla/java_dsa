package polymorphism;

public class Calloverloading {
    //method overloading
    public void  add(int a , int b ){
        System.out.println(a+b);
    }
    public  void add(int a , int b , int c){
        System.out.println(a+b+c);
    }
    public void add(double a , double b){

    }

    public static void main(String[] args) {
        Calloverloading obj = new Calloverloading();
        obj.add(2,3);
        obj.add(2,3,4);
        System.out.println(obj);
    }
}

