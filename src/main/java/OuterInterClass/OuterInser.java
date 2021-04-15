package OuterInterClass;
/*
* 外部类 内部类演示
* */
public class OuterInser {
    private int age=10;
  /*  public class Inser{
        public  void show(){
            System.out.println(age);

        }
    }*///这种方法不常用
    private class Inser{
       public void  show(){
           System.out.println(" show");
        }
  }
  public void method(){
        Inser is=new Inser();
        is.show();
  }

}
