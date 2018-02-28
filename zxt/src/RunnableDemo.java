public class RunnableDemo implements Runnable {
    private int num = 10;

    @Override
    public void run(){
        while(num>0){
            System.out.println(Thread.currentThread().getName()+"--------"+num--);
        }
    }
}
