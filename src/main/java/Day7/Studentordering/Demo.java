package Day7.Studentordering;

import java.util.*;

//用来Collection 方法
//排序 student 先按照年龄排序 后按照        字母顺序排序
public class Demo {
    public static void main(String[] args) {

        Student s1=new Student("zansan",55);
        Student s2=new Student("lisi",25);
        Student s3=new Student("wangwu",15);
        Student s4=new Student("wangwu",15);
        //Arrlist 集合存储得数据没有 自动排序
        //若是重写equlis 方法也不能 使它自动排序
        //treeset集合也不能排序正常
        ArrayList<Student> list=new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num=o1.getAge()-o2.getAge();
                //这里必须要用compareto 才能进行比较
                int num2=num==0?o1.getName().compareTo(o2.getName()):num;
                return num2;
            }
        });
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()){
            Student next = iterator.next();
            System.out.println(next.getName()+next.getAge());
        }

    }
}
