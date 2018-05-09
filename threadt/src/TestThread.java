public class TestThread {
    public static void main(String args[]){
        ThreadTest R1 = new ThreadTest("Thread-1");
        R1.start();

        ThreadTest R2 = new ThreadTest("Thread-2");
        R2.start();
    }
}
