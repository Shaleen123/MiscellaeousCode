import java.util.concurrent.Callable;

public class EvenNumberPrinting implements Callable {
    private int counter = 0;

    public Object call() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println(counter++);
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);
        }
        return counter;
    }
}
