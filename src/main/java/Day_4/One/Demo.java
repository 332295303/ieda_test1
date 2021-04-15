package Day_4.One;
//包装类常用的方法
public class Demo {
    public static void main(String[] args) {
        Integer it=new Integer("155555555");
        System.out.println(it);
        System.out.println("--------------");
        Integer integer=new Integer("555");
        System.out.println(integer);
        System.out.println("--------------");
        Integer i=Integer.valueOf(500);
        Integer i1=Integer.valueOf("asd");
        System.out.println(i);
        System.out.println(i1);
    }
}
