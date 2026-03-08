package Abstractt;

public class abb {
    public static void main(String[] args){
    Employee e1 = new FullTimeEmployee();
        System.out.println(e1.calculateSalary());

        ContractEmployee e2 = new ContractEmployee();
        e2.login();
        //e2.calculateSalary();
    }}
abstract class Employee {
    String name;
    void login() {
        System.out.println("Employee logged in");
    }
    abstract double calculateSalary();
}
 class FullTimeEmployee extends Employee {
    double calculateSalary() {
        return 50000;
    }
}
class ContractEmployee extends Employee {
    double calculateSalary() {
        System.out.println(30000);
        return 30000;
    }
}