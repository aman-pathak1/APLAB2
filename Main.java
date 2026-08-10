
public class Main {
    public static void main(String[] args) {
        // function overloading static polymorphism
        Calculator c1 = new Calculator();
        System.out.println(c1.add(10, 20));
        System.out.println(c1.add(10, 20, 30));
        // function overriding 
        Child c = new Child();
        c.show();
        // Daynamic Dispatch or runtime polymorphism
        Father f = new SmallChild();
        f.show();
    }
}