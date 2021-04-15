package Day15.SetAccessDemo;

import java.lang.reflect.Constructor;

public class Demo {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("Day15.SetAccessDemo.Student");
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true);
        Object saasdas = declaredConstructor.newInstance("saasdas");

        System.out.println(saasdas);

        //Day15.SetAccessDemo.Student
    }
}
