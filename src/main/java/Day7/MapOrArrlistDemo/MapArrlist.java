package Day7.MapOrArrlistDemo;

import DemoPenson.Penson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class MapArrlist {
    public static void main(String[] args) {
    /*    HashMap<String, ArrayList<String>> hashMap=new HashMap<String, ArrayList<String>>();
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("咱三");
        arrayList.add("45");
        hashMap.put("第一",arrayList);
        Set<String> strings = hashMap.keySet();//获得键值;
        for (String s:strings){//Arrlist得集合 名字是 s
            ArrayList<String> arrayList1 = hashMap.get(s);
            for (String s1:arrayList1) {
                System.out.println(s1+strings);
            }
        }*/
    ArrayList<HashMap<String,String>> arrayList=new ArrayList<HashMap<String,String>>();
    HashMap<String,String> stringStringHashMap=new HashMap<String, String>();
    stringStringHashMap.put("di","zangsan ");
    stringStringHashMap.put("22","sadasd");
    arrayList.add(stringStringHashMap);
    for (HashMap<String,String> hashMap :arrayList){//得到arrlist里面的hash马屁集合
        Set<String> strings = hashMap.keySet();//获得 hashmap集合里面的键集合
        System.out.println(strings);
        for (String s:strings){//s是 set集合里面的一个键值
            String s1 = hashMap.get(s);//获取该键得值
            System.out.println(s1+s);
        }

    }
    }
}
