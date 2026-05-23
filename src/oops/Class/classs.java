package oops.Class;

class Student{
    String name;
    int age ;
}
class Mobiles {
    String brand;
    int price;
}

public class classs {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "syam";
        s1.age = 22;
        System.out.println(s1.name +" "+s1.age);

        Mobiles f1 = new Mobiles();
        f1.brand ="oneplus";
        f1.price = 22000;

        Mobiles f2 = new Mobiles();
        f2.brand ="nokia";
        f2.price = 22000;

    }

}
