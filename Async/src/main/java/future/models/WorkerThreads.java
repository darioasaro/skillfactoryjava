package future.models;

public class WorkerThreads implements Runnable {
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
    public void run() {
     

    }


}
