import java.io.FileNotFoundException;

public class ExceptionHandling {

    public void display(String a ,String  b) throws FileNotFoundException {
         a.equalsIgnoreCase(b);
    }

    public static void main(String[] args) throws FileNotFoundException {

        ExceptionHandling eh = new ExceptionHandling();

        eh.display(null,"shaleen");

    }
}
