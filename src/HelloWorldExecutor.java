import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class HelloWorldExecutor {

    public void run() {
        Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> System.out.println("Hello World"));
    }
}
