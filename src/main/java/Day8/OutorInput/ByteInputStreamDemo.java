package Day8.OutorInput;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteInputStreamDemo {
    public static void main(String[] args)throws IOException {
        FileInputStream in=new FileInputStream("F:\\ideawork\\ieda_test\\src\\Day8\\Test.txt");
        byte [] by=new byte[1024];
        int len;
        while ((len=in.read(by))!=-1){
            System.out.println(new String(by,0,len)+len);
        }
    }
}
