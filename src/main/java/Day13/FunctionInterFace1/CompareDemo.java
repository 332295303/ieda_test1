package Day13.FunctionInterFace1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompareDemo {
    public static void main(String[] args) {
        ArrayList<String> s=new ArrayList<String>();
        s.add("sada");
        s.add("s");
        s.add("sadadasda");
        System.out.println("排序前"+s);
        Collections.sort(s);
        System.out.println("排序后"+s);
        Collections.sort(s,gei1());
        System.out.println(s);

    }
    private static Comparator<String>gei(){
        Comparator<String> comp=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        };
        return comp;

    }
       private static Comparator<String>gei1(){
        return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        };
    }
    private static Comparator<String>gei2(){
       return (s1,s2)->s1.length()-s2.length();
    }


}
