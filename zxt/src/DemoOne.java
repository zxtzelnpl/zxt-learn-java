public class DemoOne {
    static int num1 = 0;
    {
        System.out.println("构造方法上面");
    }
    static {
        System.out.println("静态语句块");
    }
    public DemoOne(){
        System.out.println("构造方法");
    }
    public static void test(){
        System.out.println("'test'");
    }
    public void testForObj(){
        System.out.println("test for obj the num1 is:"+num1);
    }
}
