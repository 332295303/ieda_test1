package Day8.OutorInput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static java.lang.System.out;

public class InputStreamorOutputStream {
    public static void main(String[] args)  {
        FileOutputStream out=null;
        FileInputStream in=null;

        try {int by=0;
            in=new FileInputStream("F:\\ideawork\\ieda_test\\src\\Day8\\Test.txt");
            out=new FileOutputStream("F:\\ideawork\\ieda_test\\src\\Day8\\Test1.txt",true);
            while ((by= in.read())!=-1){
                out.write(by);

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out!=null){
                    out.close();
                    in.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
