package future.models;

import java.util.concurrent.Callable;

public class WorkerThreads implements Callable {
 private String name;
 public WorkerThreads(String name){
     this.name = name;
 }

    @Override
    public String toString() {
        return "WorkerThreads{" +
                "name='" + name + '\'' +
                '}';
    }


    @Override
    public Object call() throws Exception {
        long sum = 0;

        for (long i = 0; i <= 100; i++) {

            sum += i;

        }

        return sum;

    }
}
