import java.sql.Time;
import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        new HelloWorldExecutor().run();
        new HelloWorldExecutorService().run();

        long start1 = System.currentTimeMillis();
        new PrinterExecutorService().run(10);
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        new PrinterExecutorService().run(2);
        long end2 = System.currentTimeMillis();


        System.out.println("printer pool of 10 " + (end1-start1) + "ms");
        System.out.println("printer pool of 2 " + (end2-start2) + "ms");

        Thread.sleep(1000);

        start1 = System.currentTimeMillis();
        new WaiterExecutorService().run(10);
        end1 = System.currentTimeMillis();

        start2 = System.currentTimeMillis();
        new WaiterExecutorService().run(2);
        end2 = System.currentTimeMillis();

        System.out.println("waiter pool of 10 " + (end1-start1) + "ms");
        System.out.println("waiter pool of 2 " + (end2-start2) + "ms");
    }
}