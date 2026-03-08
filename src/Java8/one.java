package Java8;

public class one {
    public static void main(String[] args) {
        Greeting g = () -> System.out.println("heloo");
        g.sayHello();
    }
}
interface  Greeting{
    void sayHello();
}
/*
public static void main(String[] args) {

    Greeting g = new Hello();
    g.sayHello();

}
// List<String> name = List.of("syam" ,"kumar", "nani");
//name.foreach(name -> System.out.priny(name));

// stream  List<Interger> num = List.of(1,2,3,4,5);
//num.stram().filter(n -> n > 3).forEach(System.out::println); 4
//list.stream().map(n -> n * 2)
//sorted   list.stream().sorted()

List<User> users = userRepository.findAll();
users.stream()
         .filter(user -> user.isActive())
        .forEach(System.out::println);*/