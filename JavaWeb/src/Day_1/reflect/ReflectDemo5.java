package Day_1.reflect;


import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/*
演示  假的框架
* */
public class ReflectDemo5 {
    public static void main(String[] args)throws Exception {

        Properties properties=new Properties();
        ClassLoader classLoader = ReflectDemo5.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("aa.properties");

        properties.load(resourceAsStream);
        String className = properties.getProperty("ClassName");
        String methodName = properties.getProperty("MethodName");
        Class<?> aClass = Class.forName(className);
        Object o = aClass.newInstance();
        Method method = aClass.getMethod(methodName);
        method.invoke(o);
        System.out.println("nihhao   git hub  saaasdas");

    }
}
