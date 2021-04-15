package InterfaceExtendsDemo;

public class Cat extends Anamal implements Inter{

    public Cat(String name, int age) {
        super(name, age);
    }


    public Cat() {
        System.out.println(" miaomiaomiao");
    }


    @Override//重写了 接口的jump 方法 做到了具体实现

    public void jump() {
        System.out.println("我是猫 跳高了我 ");
    }

    @Override
    public void eat() {
        System.out.println("maochifan  ");
    }

    public void show(){
        System.out.println(" name" +getName()+" age"+getAge());
    }
}
