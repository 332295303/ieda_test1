package Day10.ClassStreamDemo;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
          /*  ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("1.txt"));
            Student s1=new Student("张三",18);
            oos.writeObject(s1);*/

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("1.txt"));
         Student student=(Student) ois.readObject();
        System.out.println(student.getName()+ student.getAge());

        }

}
