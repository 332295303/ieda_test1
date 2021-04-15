package Day7.Map_geivaluetest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
// map 集合存储 取出得几种方式  map  地图意思  一个坐标对应一个值 即为map
//hash 拼凑得意识
//两种去方式 一种是 keyset
//一种是 map.Entry《》  entry 进入得意识  然后进去  取得key 值和value得值
public class Traverse {
    public static void main(String[] args) {
        HashMap<String,Student> hashMap=new HashMap<String, Student>();
        Student student=new Student("张三",53);
        Student student1=new Student("李四",43);
        Student student2=new Student("王三",23);
        Student student4=new Student("王三",23);
        hashMap.put("1",student);
        hashMap.put("2",student1);
        hashMap.put("3",student2);
        hashMap.put("3",student2);
        Set<String> strings = hashMap.keySet();
        for (String s:strings){
            Student value = hashMap.get(s);
            System.out.println(strings+value.getName()+"   sss"+value.getAge());
        }
        Set<Map.Entry<String,Student>> entries=hashMap.entrySet();
        for (Map.Entry<String,Student> stringStudentEntry: entries){
            String key=stringStudentEntry.getKey();
            Student student3=stringStudentEntry.getValue();
            System.out.println(key+student3.getAge()+student3.getName() );
        }
    }
}
