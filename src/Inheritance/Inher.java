package Inheritance;
//it mechanism  where a new class acquarires  the feld  & methiod  pf exesting class or method

class  Calc{
    public int add (int n1, int n2){ return n1 + n2;}
}

class  Advance extends Calc{
    public int multipy(int n1 , int n2){
        return n1 * n2;
    }
}

class VeryAdvance extends  Advance{
    public int reminder(int n1 , int n2){
        return n1 / n2;
    }
}


public class Inher {
    public static void main(String[] args) {
     VeryAdvance obj = new VeryAdvance();
     int r1 = obj.add(2 , 4);
     System.out.println(r1);
    }
}
