package DemoPenson;

public class Penson {
    String name;
    int age;

    public Penson() {
    }

    public Penson(String name, int age) {
        this.name = name;
        this.age = age;
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
 public  void pri(){
     System.out.println("我是一个人"+","+this.name+this.age);
 }
}
