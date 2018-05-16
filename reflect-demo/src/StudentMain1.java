import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import fanshe.*;

public class StudentMain1 {

    public static void main(String[] args) throws Exception
    {

        /*
         * 我们利用反射和配置文件，可以使：应用程序更新时，对源码无需进行任何修改
         * 我们只需要将新类发送给客户端，并修改配置文件即可
         */
        // 通过反射获得Class对象
        Class studentClass = Class.forName(getValue("className"));
        //获取show()方法
        Method m = studentClass.getMethod(getValue("methodName"),String.class);
        //调用show()方法
        m.invoke(studentClass.getConstructor().newInstance(),"zxt");

    }

    public static String getValue(String key) throws IOException{
        Properties pro = new Properties();
        FileReader in = new FileReader("E:\\zxt-learn-java\\reflect-demo\\src\\student.config");
        pro.load(in);
        in.close();
        return pro.getProperty(key);
    }
}
