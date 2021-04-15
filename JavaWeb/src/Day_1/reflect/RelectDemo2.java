package Day_1.reflect;

import Day_1.domain.Person;

import java.io.File;
import java.lang.reflect.Field;

/*
* 用于 class 类中方法的演示
*   反射
*
*
*
* */
public class RelectDemo2 {
    public static void main(String[] args) throws Exception{
        Person s=new Person();
        Class<? extends Person> aClass = s.getClass();
        Field[] fields = aClass.getFields();//获取所以的public修饰的成员变量
        for (Field field:fields){
            System.out.println(field); //只拿到了public修饰的成员变量
        }
        Field a = aClass.getField("a");//拿到它 public 修饰的变量
        System.out.println(a);
        Object o = a.get(s);
        System.out.println(o);
        a.set(s,"songmolei");
        System.out.println(s.toString());
        System.out.println("====================");
        Field[] declaredFields = aClass.getDeclaredFields();//获取所有的成员方法  包括 //私有 默认  静态 公共
        for(Field field:declaredFields){
            System.out.println(field);
        }
        System.out.println("======================");
        Field d = aClass.getDeclaredField("d");
        d.setAccessible(true);//忽略访问修饰符的安全检查  若是不设置则拿不到
        // 私有变量的value  静态也会报错   默认也不大型
        Object o1 = d.get(s);  //用这个方法调用类 需要 指定那个类 会返回 该类的 初始化值 如String =null
        System.out.println(o1);
        d.set(s,"送莫雷大傻吊");
        System.out.println(s.toString()); //没有一点点问题 咱也不知道为什么 为什么上面设置的值 会映射到下面
        //出现了一丝小疑问 为什么  两次用不同的方法调用  他们的值 会相通
        //因为 他们拿到的是 同一个类 操作的也是同一类 所以送莫雷是大傻吊 还有送莫雷可以同时显示
    }
}
