package Typeconverstion;



//the process of converting samller data type to larger data
public class typeconv {
    public static void main(String[] args) {
        float k = 338;
       // int d = (float)k;


        byte b =127;
        int a = 128; //implicity
        //Incompatible types. Found: 'int', required: 'byte'
       // b = a;
           //casting
        b=(byte)a;
        System.out.println(b);
    }

}
