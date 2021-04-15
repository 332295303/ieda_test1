package Day15.SetAccessDemo;

public class Student {
    private String name;

    public Student() {
    }

    private Student(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
