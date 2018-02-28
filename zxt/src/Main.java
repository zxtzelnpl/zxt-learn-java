import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        ExecutorService pool = Executors.newFixedThreadPool(2);
        Future<Integer> future = pool.submit(new CallableDemo(10));
        Future<Integer> future2 = pool.submit(new CallableDemo(100));

        try{
            System.out.println(future.get());
            System.out.println(future2.get());
        }
        catch(ExecutionException e){
            e.printStackTrace();
        }
    }
}
