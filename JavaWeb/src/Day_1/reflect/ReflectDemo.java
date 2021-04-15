package Day_1.reflect;

import Day_1.domain.Person;
/*
* i.    	Class.forName(“全类名”); 将字节码文件加载进内存  第一种方式
ii.	    可以通过类名的属性class来获取类名.class			第二种方式
iii.	可以通过对象.class来获取                            第三 章方式

*
* */
public class ReflectDemo {
    public static void main(String[] args) throws Exception{
        Class<?> aClass = Class.forName("Day_1.domain.Person");
        System.out.println(aClass);
        Class<Person> personClass = Person.class;
        System.out.println(personClass);
        Person person=new Person();
        Class<? extends Person> aClass1 = person.getClass();
        System.out.println(aClass1);
        boolean equals = aClass1.equals(aClass);
        System.out.println(equals);
        System.out.println((aClass==aClass1));
        System.out.println(aClass1==personClass);
    }
}
