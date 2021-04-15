package Day10.Properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {

        writefile();
        read();
    }

    private static void read() throws IOException {
        FileReader fr=new FileReader("1.txt");
        Properties ps=new Properties();
        ps.load(fr);
        fr.close();
        Set<Map.Entry<Object, Object>> entries = ps.entrySet();
        for (Map.Entry<Object, Object> o:entries){

           System.out.println(o.getValue()+""+o.getKey());
        }
        Object 王五 = ps.get("王五");
        System.out.println(王五);
        System.out.println(ps);
    }

    private static void writefile() throws IOException {
        Properties ps=new Properties();
        ps.setProperty("张三","22");
        ps.setProperty("李四","72");
        ps.setProperty("王五","12");
        FileWriter fw=new FileWriter("1.txt");
        ps.store(fw,"store是储藏蕴藏意思");
        fw.close();
    }
}
