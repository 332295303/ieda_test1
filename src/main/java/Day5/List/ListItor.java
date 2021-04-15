package Day5.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListItor {
    public static void main(String[] args) {
        //linklist集合得三种遍历方式
        //
        LinkedList <String> linkedList=new LinkedList<String>();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        //1增强for循环类型
        for (String string:linkedList)
        {
            System.out.println(string);
        }
        // LIstintor 迭代器循环
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
        //第三种循环方法  用集合本身来循环
        for (int i=0;i<linkedList.size();i++){
            String s = linkedList.get(i);
            System.out.println(s);
        }

    }
}
