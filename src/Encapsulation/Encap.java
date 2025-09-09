package Encapsulation;

  class w {
     private String name;

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }
 }
public class Encap {
    public static void main(String[] args) {
        w obj = new w();
        obj.setName("Syam");
        System.out.println(obj.getName());
    }
}
