package future;

import future.models.WorkerThreads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class App {
    private static final int NTHREDS = 10;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);
        List<Future<Long>> list = new ArrayList<Future<Long>>();
        for(int i=0;i<3000;i++){
            Callable<Long>worker = new WorkerThreads("worker"+i);
            Future<Long>submit = executor.submit(worker);
            list.add(submit);
        }
        long sum = 0;
        System.out.println(list.size());
        for(Future<Long>future : list){
            try {
                sum+=future.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
            System.out.println("suma" + sum);
        }
        executor.shutdown();
    }
}
