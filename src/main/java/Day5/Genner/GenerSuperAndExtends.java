package Day5.Genner;

import java.util.ArrayList;
import java.util.List;
//  演示类型通配符
public class GenerSuperAndExtends {
    public static void main(String[] args) {
        List<?> list=new ArrayList<Integer>();//同配型
        List<? extends Number> list2=new ArrayList<Integer>();//最高限制类型
        List<? super  Object> list1=new ArrayList<Object>();
    }
}
