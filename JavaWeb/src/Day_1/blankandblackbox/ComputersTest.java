package Day_1.blankandblackbox;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ComputersTest {

    @After//一半用于资源申请
    public void  end(){
        System.out.println("在所有方法执行值后都会之行这个方法");

    }
    @Test//测试方法
    public void testComputer(){
        Computers computers=new Computers();
        int add = computers.add(5, 6);
        //断言 我断言这个结果是这个
        //如果实际结果和预测结果不一致那么就会出现红色 一致出现绿色
        Assert.assertEquals(11,add);
        System.out.println("我是中间 执行");
    }
    @Before//在所以测试方法执行之前 都会执行这个方法
    public void init(){
        System.out.println("before");
    }

}


