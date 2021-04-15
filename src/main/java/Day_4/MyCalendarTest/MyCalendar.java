package Day_4.MyCalendarTest;

import java.util.Calendar;
import java.util.Scanner;

//写出二月天的 需求  就是 写出某一年 输出 某一年的2月份有多少天
public class MyCalendar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Calendar calendar=Calendar.getInstance();
        int i = scanner.nextInt();
        calendar.set(i,2,1);
        calendar.add(Calendar.DATE,-1);
        int date=calendar.get(Calendar.DATE);
        System.out.println(date);


    }
}
