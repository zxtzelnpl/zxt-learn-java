import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*public class SellTongLuoShao implements Runnable {

    private int num = 30;
    private Lock rLock = new ReentrantLock();

    @Override
    public void run(){
        rLock.lock();
        try{
            while(num>0){
                try{
                    Thread.sleep(300);
                    System.out.println(Thread.currentThread().getName()+" 帮哆啦A梦卖出了第"+num--+" 个铜锣烧。");
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
        finally{
            rLock.unlock();
        }

    }
}*/


public class SellTongLuoShao implements Runnable {

    private int num = 30;
    @Override
    public synchronized void run(){
        while(num>0){
            try{
                Thread.sleep(300);
                System.out.println(Thread.currentThread().getName()+" 帮哆啦A梦卖出了第"+num--+" 个铜锣烧。");
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}