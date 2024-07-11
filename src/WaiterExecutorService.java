import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class WaiterExecutorService {

    public void run(int poolSize) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(poolSize);
        int loppSize = 10;
        List<Future<String>> futures = new ArrayList<>(loppSize);

        for (int i = 0; i < loppSize; i++) {
            futures.add(executorService.submit(() -> {
                Thread.sleep(1000);
                return null;
            }));
        }

        executorService.close();
        for (Future<String> element: futures) {
            String result = element.get();
        }
    }
}
