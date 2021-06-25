import java.util.function.Consumer;
import java.util.function.Supplier;
/*
Functional interface along with existing functional interfaces
Lambda expression introduction
Wherever functional interface is there, we can use lambda expressions
*/

public class Java8Interfaces {

    //  predicate,Consumer, Supplier

    public static void main(String[] args) {

        //lambda expression:They are anonymous function,No method name, no return type, no access modifier
        // functional interfaces used to invoke lambda expressions we need
        //

        //predicate

        //Consumer accepts single argument and performs operation and it doest not return anything.
        //Consumer<T> ->T represents argument
        //It has accept method
        Consumer<String> consumer = s -> System.out.println(s);

        consumer.accept("Hi Consumer");
        consumer.accept("Hello");

        //Supplier
        //opposite of consumer
        //Supplier<R>->R is the return type not the argument
        //Supplier always returns value, it does not take any argument, it takes return type
        //it has get() method
        Supplier<String> supplier = () -> {
            String[] names = {"shaleen", "sunny", "shweta", "sona"};
            int number = (int) (Math.random() * 3 + 1);
            return names[number];
        };

        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
    }

}