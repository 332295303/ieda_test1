package InterfaceExtendsDemo;

public class Dog extends Anamal implements Inter {
    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    @Override
    public void jump() {
        System.out.println(" 狗跳搞了   ");
    }

    @Override
    public void eat() {
        System.out.println("  狗吃饭");
    }

    public  void show(){
        System.out.println(" name 狗"+getName()+" age"+getAge());
    }
}
