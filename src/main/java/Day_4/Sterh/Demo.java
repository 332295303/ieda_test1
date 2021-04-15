package Day_4.Sterh;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        String s="15 623 65 56 65 32";
        String []arr=s.split(" ");
        int [] intArr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            intArr[i]=Integer.parseInt(arr[i]);
        }
        Arrays.sort(intArr);
        StringBuilder stringBuilder=new StringBuilder();
        for (int i=0;i<intArr.length;i++){
            if (i==intArr.length-1){
                stringBuilder.append(intArr[i]);
            }
            else
                stringBuilder.append(intArr[i]+" ,");
        }
        stringBuilder.toString();
        System.out.println(stringBuilder);
    }
}
