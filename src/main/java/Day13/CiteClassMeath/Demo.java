package Day13.CiteClassMeath;

public class Demo {
    public static void main(String[] args) {
        userCiteClass((String s)->{
            return  Integer.parseInt(s);  //lambda 表达式
        });
        //因为是一个数据  一个方法所以小括号 和大括号可以省略
        userCiteClass(s -> Integer.parseInt(s));
        //当lambda表达式被类方法替代时 它的形式参数全部传给 引用类的静态方法作为参数
        userCiteClass((Integer::parseInt));//引用类类型

    }
    private static void userCiteClass(Inter inter){
        int i = inter.printOf("5655");
        System.out.println(i);

    }
}
