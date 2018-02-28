public class DuoLaAMeng implements Runnable{
    private TongLuoShao tongluoshao;
    private int x = 0;

    public DuoLaAMeng(TongLuoShao tongluoshao){
        this.tongluoshao = tongluoshao;
    }

    @Override
    public void run(){
        synchronized (tongluoshao){
            while(true){
                if(tongluoshao.flag){//没有就生产，有就等待
                    try{
                        tongluoshao.wait();//wait之后，锁就释放掉了！
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }

                if(x%2==0){
                    tongluoshao.setTongluoshao("热腾腾的铜锣烧");
                }else{
                    tongluoshao.setTongluoshao("冷冻冻的铜锣烧");
                }

                x++;

                tongluoshao.flag = true;

                tongluoshao.notify();
            }
        }
    }
}
