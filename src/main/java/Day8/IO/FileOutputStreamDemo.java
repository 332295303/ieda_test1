package Day8.IO;

import java.io.File;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws Exception {
        FileOutputStream out=new FileOutputStream("F:\\ideawork\\ieda_test\\src\\Day8\\Test.txt");
        out.write(56);
        out.write('s');
        out.close();
/*
        File file=new File("asda.txt");
        System.out.println(file.getAbsoluteFile());*/

    }
}
