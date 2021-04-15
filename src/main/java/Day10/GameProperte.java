package Day10;

import Day10.ClassStreamDemo.Student;
import Day10.SystemIn.Game;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class GameProperte {
    public static void main(String[] args) throws IOException {
        Properties ps=new Properties();
    //    FileWriter f1=new FileWriter("1.txt");
        FileReader fr=new FileReader("1.txt");
        ps.load(fr);
        fr.close();
        String count = ps.getProperty("count");
        int i = Integer.parseInt(count);
        if (i>3){
            System.out.println("game over  ");
        }
        else
        {
            Game.star();
            i++;
            ps.setProperty("count",String.valueOf(i));
            FileWriter fileWriter=new FileWriter("1.txt");
            ps.store(fileWriter,"");
            fileWriter.close();//没有理解 改进



        }

    }
}
