package Day5.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// collection 集合得使用 与迭代器得使用
public class Mycollection {
    public static void main(String[] args) {
       Collection <String> collections= new ArrayList<String>();
        collections.add("ss");
        collections.add("ada");
        Iterator<String> iterator = collections.iterator();
        while (iterator.hasNext()){//判断是否有下一个元素
            String s = iterator.next();//用来拿到下一个元素  返回值是一个String得类型
            System.out.println(s);
        }
    }
}
