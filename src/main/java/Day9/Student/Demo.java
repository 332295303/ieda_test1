package Day9.Student;

import java.io.*;
import java.util.Comparator;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) throws IOException {
        Student S1=new Student("李五",15,56,44);
        Student S2=new Student("李四",65,44,74);
        Student S3=new Student("张三",11,5,24);
        TreeSet<Student> treeSet=new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int n=o1.getNum()-o2.getNum();
                return n;
            }
        });
        treeSet.add(S1);
        treeSet.add(S2);
        treeSet.add(S3);
        FileWriter fi=new FileWriter("F:\\ideawork\\ieda_test\\src\\Day9\\Test.txt");
        BufferedWriter bw=new BufferedWriter(fi);

        StringBuilder sb;
        for (Student s:treeSet){
            sb=new StringBuilder();
            sb.append(s.getName()+","+s.getEnglish()+","+s.getMath()+","+s.getLanguage());
           bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        fi.close();
        bw.close();


    }
}
