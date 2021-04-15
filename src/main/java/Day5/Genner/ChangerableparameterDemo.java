package Day5.Genner;
//可变参数演示  为了解决不缺定参数是多少个  而出现的方法
public class ChangerableparameterDemo {
    public static void main(String[] args) {
           int sum= meathed(556,6,6,1,2,3,1,3,1);
        System.out.println(sum);
    }
    public static int meathed(int ...a){
        int sum=0;
        for (int i:a){
            sum+=i;
        }
        return sum;
    }
}
