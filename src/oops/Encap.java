package oops;
//Encapsulation = Wrapping data + methods together
//✔ Use private variables
//✔ Access them using getters & setters
public class Encap {
    public static void main(String[] args) {
Bankaccount obj = new Bankaccount();
    obj.setBalance(100);
    System.out.println(obj.getBalance());
    }



}

class  Bankaccount{
     private int balance = 100;
     public int getBalance(){
         return  balance;
     }
     public void setBalance(int amount){
         if(amount > 0){
             balance = balance + amount;
         }
     }


}
