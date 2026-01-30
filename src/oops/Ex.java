package oops;

public class Ex {
    public static void main(String[] args) {
        int age = 15;

        if (age < 18) {
            throw new RuntimeException("Not eligible to vote");
        }

        System.out.println("Eligible to vote");
    }
}
//“I found a problem, I am reporting it now”
//You are manually saying there is an error.