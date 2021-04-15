package Day_4.MyDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataFormatText {


    private  DataFormatText(){

    }
    public static String toDateFormat(Date date, String format){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(format);
        String s1= simpleDateFormat.format(date);
        return s1;

    }

    public static Date toDateforMat(String format,String s) throws ParseException {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(format);
        Date date1 = simpleDateFormat.parse(s);
        return  date1;

    }
}
