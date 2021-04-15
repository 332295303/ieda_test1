package Day_4.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSimploformat {
    private  DateSimploformat(){}
    public  static Date dateString(String s,String format) throws ParseException {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(format);
        Date date=simpleDateFormat.parse(s);
        return date;
    }
    public  static String  dateString(Date date,String format){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(format);
        String  string=simpleDateFormat.format(date);
        return string;
    }
}
