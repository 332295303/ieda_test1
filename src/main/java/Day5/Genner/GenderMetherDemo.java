package Day5.Genner;
//泛型方法
public class GenderMetherDemo {
    public  void show(String t) {
        System.out.println(t);
    }//方法的重载
    public  void show(boolean t) {
        System.out.println(t);
    }
    public  void show(int t) {
        System.out.println(t);
    }

    public <T> void aa(T t){
        System.out.println("这样得话  就可以 在调用方法得时候 传入参数 来确定他得值");
    }
}
