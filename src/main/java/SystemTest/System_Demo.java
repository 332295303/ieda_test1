package SystemTest;

public class System_Demo
{
    public static void main(String[] args) {
        long star=System.currentTimeMillis();
        System.out.println("开始");
        //结束虚拟机
        //多少年看一下
       // System.out.println(System.currentTimeMillis()/1000/60/60/24/365*1.0+"年");
       // System.exit(0);
        for (int i=0;i<9999;i++){
            for (int j=0;j<9999;j++){

            }
        }
        long end=System.currentTimeMillis();
        System.out.println("结束"+(end-star));
    }
}
