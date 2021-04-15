package Day13.Lambda1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

//不带参数的那种
public class DemoLambda {
    public static void main(String[] args) {
      /*  ImpFace impFace=new ImpFace();
        UseLambda(impFace);*/  //由具体类实现接口 正宗调用
        /*UseLambda(new FaceDemo() {
            public void eat() {
                System.out.println("匿名内部类"); //重写了接口方法 接口里 没有用类实现的方式
            }
        });*/
        UseLambda(()-> {
            System.out.println("lambad表达式");
        });
    }
    public  static  void UseLambda(FaceDemo faceDemo){
        faceDemo.eat();
    }
}
