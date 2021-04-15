package Day5.TreeSet;

import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        TreeSet<Student> set=new TreeSet<Student>();
        Student student1=new Student("张三",51);
        Student student2=new Student("李四",52);
        Student student3=new Student("王无",33);
        Student student4=new Student("张三",33);
        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(student4);
        for (Student stu:set){
            System.out.println(stu.toString());
        }
    }
}
