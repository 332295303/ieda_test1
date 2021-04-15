package Day10.SystemIn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import static java.lang.System.*;
//标准输入流的流程
public class InDemo {
    public static void main(String[] args)throws IOException {
        InputStream in = System.in;//InputStream 是他的标准输入流
        int len;
      /*  while ((len=in.read())!=1){
            out.println((char)len);
        }*/
        //输入的是字节流  那么如何将字符流转换成字节流拿
        //用转换流  Scanner 包装的也是一个类
        InputStreamReader isr=new InputStreamReader(in);
        BufferedReader br=new BufferedReader(isr);
        out.println(br.readLine());
        br.close();
        isr.close();
        in.close();
    }
}
