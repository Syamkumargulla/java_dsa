package Constructor;
class Human {
    public Human(){
        System.out.println("hi");
    }

      public Human(int a){
        System.out.println(a);
    }

    public Human(int a , int b){
        System.out.println(a +"  "+ b);
    }

}
public class Const {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 = new Human(44 , 5);
    }
}
