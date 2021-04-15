package Day_1.reflect;

import Day_1.domain.Person;

import java.lang.reflect.Method;

public class ReflectDemo4 {
    public static void main(String[] args) throws Exception{
        Class<Person> personClass = Person.class;
        Method getAge = personClass.getMethod("getAge");//获得方法对象
        Method setAge = personClass.getMethod("setAge", int.class);//获得方法对象

        Person person=new Person();
        Object invoke1 = setAge.invoke(person, 66);
        Object invoke = getAge.invoke(person);
        System.out.println(invoke);

    }
}
