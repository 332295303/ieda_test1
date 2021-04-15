package Day13.Student;

public class Demo {
    public static void main(String[] args) {
        userStudent(new Inter() {
            @Override
            public Student method(String s, int age) {
                return new Student(s,age);
            }
        });
        userStudent((name,age)->new Student(name,age));
    }
   private static void userStudent(Inter s){
       Student hcy = s.method("hcy",18);
       System.out.println(hcy.getName()+hcy.getAge());

   }
}
