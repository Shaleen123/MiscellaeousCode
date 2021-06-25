import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTesting {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executors = Executors.newFixedThreadPool(10);
        CompletableFuture completableFuture = new CompletableFuture();

        completableFuture.get();
        completableFuture.complete("Welcome to Knoldus!");

        //
    }
}
