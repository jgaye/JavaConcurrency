import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentCounter {

    public int count = 0;

    public synchronized void increment() {
        count++;
    }
}
