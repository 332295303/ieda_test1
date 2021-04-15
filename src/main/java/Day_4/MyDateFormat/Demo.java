package Day_4.MyDateFormat;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//date的两种格式方法  测试类
public class Demo {
    public static void main(String[] args) throws ParseException {
        Date date=new Date();
        String format="yyyy年MM月dd日 HH：mm：ss";
        String toDateFormat = DataFormatText.toDateFormat(date, format);
        System.out.println(toDateFormat);

        Date date1=DataFormatText.toDateforMat("yyyy-MM-dd HH:mm:ss","2019-15-55 15:51:55");
        System.out.println(date1.toString());

    }

}
