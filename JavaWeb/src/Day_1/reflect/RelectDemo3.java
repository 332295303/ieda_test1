package Day_1.reflect;

import Day_1.domain.Person;

import java.lang.reflect.Constructor;
//演示 通过构造方法 来反射创建 类
public class RelectDemo3 {
    public static void main(String[] args)throws Exception{
        Class<Person> personClass = Person.class;//获取类方法
        Constructor<Person> penson = personClass.getConstructor(String.class, int.class);//获取构造方法
        Person person = penson.newInstance("zansan", 23);//通过构造方法创建对象
        System.out.println(person);
        //另一种方法  可以直接通过类直接创建文件
        Person person1 = personClass.newInstance();
        System.out.println(person1);


    }
}
