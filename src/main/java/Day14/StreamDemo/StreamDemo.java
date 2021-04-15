package Day14.StreamDemo;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Actor> arrayList1=new ArrayList<Actor>();
        arrayList1.add(new Actor("李阳"));
        arrayList1.add(new Actor("送莫雷"));
        arrayList1.add(new Actor("黄晨阳"));
        arrayList1.add(new Actor("张莫雷"));
        arrayList1.add(new Actor("李晨阳"));
        arrayList1.add(new Actor("小帆"));
        ArrayList<Actor> arrayList2=new ArrayList<Actor>();
        arrayList2.add(new Actor("小红"));
        arrayList2.add(new Actor("张倩"));
        arrayList2.add(new Actor("张岱玉"));
        Stream<Actor> limit = arrayList1.stream().filter(s -> s.getName().length() == 3).limit(3);
        Stream<Actor> Actor2 = arrayList2.stream().filter(s -> s.getName().startsWith("张")).skip(1);
        Stream<Actor> concat = Stream.concat(limit, Actor2);
        concat.map(Actor::getName).forEach(System.out::println);
        //合并
        Stream.concat(arrayList1.stream().filter(s->s.getName().length()==3).limit(3),arrayList2.stream().filter(s->s.getName().startsWith("张")).skip(0)).forEach(p->System.out.println(p.getName()));
    }
}
