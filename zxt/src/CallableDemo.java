import java.util.concurrent.Callable;

public class CallableDemo implements Callable<Integer> {
    private int num;
    public CallableDemo(int num){
        this.num = num;
    }

    @Override
    public Integer call() throws Exception{
        num = num +90;
        return num;
    }
}
