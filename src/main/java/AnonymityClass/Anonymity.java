package AnonymityClass;

public class Anonymity {
    public void method(){
       /* new Inter(){
            @Override
            public void show() {
                System.out.println(" 匿名内部类");
            }
        };//这是匿名创建的一个类*/
           Inter inte = new Inter(){//这是一个接口
            @Override
            public void show() {//多次使用的话用这个方法
                System.out.println(" 匿名内部类");
            }
        };
           inte.show();


    }
}
