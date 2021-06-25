import java.io.FileNotFoundException;
import java.io.IOException;

public class Child extends Parent {

    Child() {
        System.out.println("Child constructor invoked");
    }

    @Override
    protected void display() throws FileNotFoundException {

    }

    public static void main(String[] args) {

        //Child child = new Child();

        Parent p = new Child();

    }
}


