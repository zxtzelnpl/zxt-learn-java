import school.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception{
        Class stuClass = Class.forName("school.Student");

        System.out.println("********获取所有公有的字段********");
        Method[] methodArray = stuClass.getMethods();
        for(Method m : methodArray){
            System.out.println(m);
        }

        System.out.println("********获取所有的字段(包括私有、受保护、默认的)********");
        methodArray = stuClass.getDeclaredMethods();
        for(Method m : methodArray){
            System.out.println(m);
        }

        System.out.println("********获取公有的show1()方法********");
        Method m = stuClass.getMethod("show1",String.class);
        System.out.println(m);

        Object obj = stuClass.getConstructor().newInstance();
        m.invoke(obj,"易文斌");

        System.out.println("**************获取私有的show4()方法********************************");
        m = stuClass.getDeclaredMethod("show4",int.class);
        System.out.println(m);
        m.setAccessible(true);//暴力反射，解除私有限定
        Object result = m.invoke(obj,20);
        System.out.println("返回值："+result);
    }
}
