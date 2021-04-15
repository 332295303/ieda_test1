package Day13.FunctionInterFace;
//函数式接口 有且一个接口 有且只有一个参数
public class FunctionInterDemo {
    public static void main(String[] args) {
        userRunnable(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"线程启动了");
            }
        });
        //
        userRunnable(()-> System.out.println(Thread.currentThread().getName()+"qidongla "));
    }
    private static void userRunnable(Runnable r){
        new Thread(r).start();

    }
}
