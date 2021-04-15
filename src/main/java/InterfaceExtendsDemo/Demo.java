package InterfaceExtendsDemo;

public class Demo {
    /*
    * 测试类
    * */
    public static void main(String[] args) {
            Anamal cat =new Cat();
            cat.setAge(50);
            cat.setName("喵喵喵");
            Cat cat2=(Cat)cat;
            cat2.show();
            Inter it=new Cat();
            Cat cat1=(Cat)it;
            cat1.setAge(5);
            cat1.setName(" wo miao ");
            cat1.show();
            cat1.jump();
    }
}
