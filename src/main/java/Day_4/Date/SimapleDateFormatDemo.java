package Day_4.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class SimapleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        Date date=new Date();
        SimpleDateFormat simpleDateFormat=new
                SimpleDateFormat("yyyyMMDDHHmmss");
        String s=simpleDateFormat.format(date);
        System.out.println(s);
        String s1="2021-03-29 20:05:00";
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1= format.parse(s1);
        System.out.println(date1);
    }
}
