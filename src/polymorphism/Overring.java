package polymorphism;

public interface Overring {
    public void copy();
    public void  past();
    public  void cut();
    public  void  keyboard();

    public default  void securtiy(){
        System.out.println("Laptop Security code");

    }
    public static void audio(){
        System.out.println("Laptop Audio code");
    }
}
