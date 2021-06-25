import java.io.FileNotFoundException;
import java.io.IOException;

public class Parent {
    Parent() {
        System.out.println("Parent constructor invoked");
    }

    void display() throws FileNotFoundException {
        System.out.println("Inside parent");
    }
}