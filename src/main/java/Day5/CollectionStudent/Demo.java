package Day5.CollectionStudent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        Collection<Student> students=new ArrayList<Student>();
        students.add(new Student(55,"黄晨阳"));
        students.add(new Student(54,"李阳"));
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student student=iterator.next();
            System.out.println(student.getName()+student.getAge());
        }

    }
}
