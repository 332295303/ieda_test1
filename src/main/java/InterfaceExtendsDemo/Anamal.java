package InterfaceExtendsDemo;

public abstract class Anamal {
    String name;
    int age;

    public Anamal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Anamal() {
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
    public  abstract void eat();
}
