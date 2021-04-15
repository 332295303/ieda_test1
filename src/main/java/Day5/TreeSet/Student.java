package Day5.TreeSet;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;
    private int age;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{"+getName()+getAge()+"}";
    }

    public int compareTo(Student o) {
       int a= this.age- o.getAge();
       int num=a==0?this.name.compareTo(o.getName()):a;
        return a;
    }



}
