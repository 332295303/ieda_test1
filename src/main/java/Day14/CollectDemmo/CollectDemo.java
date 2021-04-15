package Day14.CollectDemmo;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {
    public static void main(String[] args) {
        String  []arrstr= {"宋大黑,55","李大白,33","黄晨阳,12"};
        Stream<String> stream = Stream.of(arrstr).filter(s -> Integer.parseInt(s.split(",")[1]) > 25);
        Map<String, String> collect = stream.collect(Collectors.toMap(s -> s.split(",")[0], s -> s.split(",")[1]));
        Set<String> strings = collect.keySet();
        for (String s:strings){
            String s1 = collect.get(s);
            System.out.println("key"+s+"value"+s1);

        }


    }
}
