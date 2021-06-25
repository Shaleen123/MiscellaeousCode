import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sorting {
    public static void main (String[]args){

ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.execute(() -> System.out.println("Asynchronous task"));

        executorService.shutdownNow();

        System.out.println("main task");
    }
}
