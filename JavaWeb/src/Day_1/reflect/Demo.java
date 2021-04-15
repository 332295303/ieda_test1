package Day_1.reflect;

import java.io.BufferedReader;
import java.io.FileReader;

public class Demo {
    public static void main(String[] args)throws Exception {
        String name = Demo.class.getName();
        System.out.println(name);
        FileReader fileReader=new FileReader("Pro.properties");
        BufferedReader br=new BufferedReader(fileReader);
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }

    }
}
