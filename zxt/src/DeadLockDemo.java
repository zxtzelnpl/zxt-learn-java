public class DeadLockDemo extends Thread {
    private boolean flag;
    public DeadLockDemo(boolean flag){
        this.flag = flag;
    }

    public void run(){
        while(true){
            if(flag){
                synchronized (MyLock.obj1){
                    System.out.println("if 语句，用的是obj1的锁");
                    synchronized(MyLock.obj2){
                        System.out.println("if 语句，用的是obj2的锁");
                    }
                }
            }else{
                synchronized (MyLock.obj2){
                    System.out.println("if 语句，用的是obj2的锁");
                    synchronized(MyLock.obj1){
                        System.out.println("if 语句，用的是obj1的锁");
                    }
                }
            }
        }
    }
}
