package Day13.Lambda2;

import CatEat.UserAnamal;
//lambda 带参方法演示
//Lambda 方法使用条件  1接口
//2 接口中只有唯一的方法
public class LambdaDemo1 {
    public static void main(String[] args) {
        /*ImpFaceDemo1 im=new ImpFaceDemo1();//最正常的调用方式
        UserParameter(im);*/
       /* UserParameter(new FaceDemo1() {
            @Override
            public void eat(String s) {//使用匿名内部类 它会自动调用方法中写下的方法 并传递过去
                //s的值
                System.out.println(s);
                System.out.println("吃不饱");
                //然后在调用自己重写的 输出语句吃不饱
            }
        });*/
        UserParameter((String s)->{  //lambda表达式的带参应用方法
                                        //（接口的参数类型 参数）-》箭头
            System.out.println(s);
            System.out.println("继续吃不饱");
        });
    }
    public  static void UserParameter(FaceDemo1 s){
        s.eat("吃饭饭");
    }
}
