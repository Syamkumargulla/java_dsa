package Encapsulation;

class h {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int a) { age = a;
    }
}

public class En {
    public static void main(String[] args) {
     h obj = new h();
     obj.setAge(21);
     System.out.println(obj.getAge());

    }
}