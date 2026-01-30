package oops;

public class Thorww {
    public static void main(String[] args) {
        try{
            slep();
        }catch (InterruptedException e){
            System.out.println("excetiopn");
        }
    }
    //“I may cause problem, caller must handle it”
    static void slep() throws  InterruptedException{
        Thread.sleep(1000);
    }

}
//“If error happens, I am NOT handling it here. Someone else must handle it.”