package Day10.SystemIn;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//测试PrintWriter 字符输出流
public class PrintWriteDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("1.txt");//文件输入流
        PrintWriter pw=new PrintWriter(fw, true);
        pw.println("saadasd");
    }
}
