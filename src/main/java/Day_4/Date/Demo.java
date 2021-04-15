package Day_4.Date;

import java.util.Date;

public class Demo {
    //这是一个测试date的类  当你  判断一个类时候 一定要哪一个null 进行判断
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);
        System.out.println();
        System.out.println(date.getTime()/1000/60/60*1.0);
    }
}
