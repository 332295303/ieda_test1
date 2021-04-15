package Day15.ClassInstance;

import java.lang.reflect.Constructor;

public class Demo {
    public static void main(String[] args) throws Exception {
       /* Student student=new Student();
        System.out.println(student.getClass());*/
        Class<?> c = Class.forName("Day15.ClassInstance.Student");
        Constructor<?> con = c.getConstructor(String.class, int.class, String.class);
        Object o = con.newInstance("宋莫雷", 18, "女");
        System.out.println(o);

    }
}
