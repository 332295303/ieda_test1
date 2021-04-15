package Day13.CiteClassDemo2;

public class Demo {
    public static void main(String[] args) {
        /*userSubString((String s,int  x,int y)->{
            return s.substring(x,y);//lambda表达式方法
        });*/
        userSubString((s,x,y)->s.substring(x,y));
        userSubString(String::substring);
    }
    private static void userSubString(Inter s){
        String s1 = s.subString("hello nihao ", 1, 5);
        System.out.println(s1);

    }
}
