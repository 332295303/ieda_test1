package Day13.Lambda3;
//用lambda表达式 测试连个数字相加
public class LambdaDemo {
    public static void main(String[] args) {
       /* ImpFaceDemo2 im=new ImpFaceDemo2();
        UserLambda(im);*/
      /* UserLambda(new FaceDemmo2() {
           @Override  //匿名内部类实现方式
           public int add(int x, int y) {
               return x+y;
           }
       });*/
      UserLambda((int x,int y)->{

          return x+y;//调用这个他会自动调用 faceDemmo2.add(10,2);
          //然后又会调用接口中方法
          //往下运行返回x+y
          //用sum接收
          //打印
      });
    }
    public static void UserLambda(FaceDemmo2 faceDemmo2){
      int sum=faceDemmo2.add(10,2);
        System.out.println(sum);


    }
}
