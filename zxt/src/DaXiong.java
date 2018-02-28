public class DaXiong implements Runnable{
    private TongLuoShao tongluoshao;

    public DaXiong(TongLuoShao tongluoshao){
        this.tongluoshao = tongluoshao;
    }

    @Override
    public void run(){
        synchronized(tongluoshao){
            //没有就等待，有就吃!
            while(true){
                if(!tongluoshao.flag){
                    try{
                        tongluoshao.wait();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("吃------"+tongluoshao.getTongluoshao());
                tongluoshao.flag = false;
                tongluoshao.notify();
            }
        }
    }
}
