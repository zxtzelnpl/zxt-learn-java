import school.Student;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception{
        ArrayList<String> strList = new ArrayList<>();
        strList.add("aaa");
        strList.add("bbb");

        Class listClass = strList.getClass();

        Method m = listClass.getMethod("add",Object.class);

        m.invoke(strList,100);

        for(Object obj:strList){
            System.out.println(obj);
        }
    }

//    public static String getValue(String key) throws IOException{
//        Properties pro = new Properties();
//        FileReader in = new FileReader("C:\\Users\\zxt_z\\IdeaProjects\\zxt-learn-java\\zxt\\src\\pro.txt");
//        pro.load(in);
//        in.close();
//        return pro.getProperty(key);
//    }
}
