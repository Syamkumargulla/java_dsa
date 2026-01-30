package oops;

public class Encapgettersandseters {
    public static void main(String[] args) {
        Studentt s1 = new Studentt();
        s1.setId(1);
        s1.setName("Syam");
        System.out.println(s1.getId());
        System.out.println(s1.getName());
    }}
     class Studentt{
        private  int id;
        private  String name;
        public void setId(int id){
            this.id = id;
        }
        public  void  setName(String name){
            this.name = name;
        }
        public int  getId(){
            return id;
        }
        public  String getName(){
            return  name;
        }
    }
