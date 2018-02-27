import java.util.Arrays;

public class Main {
    public static void main(String[] arts){
        System.out.println("My Main");
        DemoThree d1 = new DemoThree("Thread-1");
        d1.start();

        DemoThree d2 = new DemoThree("Thread-2");
        d2.start();
    }
}
