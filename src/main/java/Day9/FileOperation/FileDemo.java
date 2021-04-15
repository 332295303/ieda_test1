package Day9.FileOperation;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file=new File("F:\\xuexi");//源文件
        String srcName = file.getName();
        System.out.println(srcName);
        File file1=new File("bbb",srcName);//目标文件
        System.out.println(srcName);
        if (!file1.exists()){

            System.out.println(file1.exists()+""+ file1.mkdir()+""+file1.getAbsoluteFile());
        }
        File[] files = file.listFiles();
        if (files!=null) {//若拿到的是空的file集合则不循环
            System.out.println(files.toString());
            for (File file2 : files) {
                System.out.println(srcName);//获取各各file名称
                String name = file2.getName();
                File file3 = new File(file1, name);//创建他 再第二个目录下

            }
        }

    }
}
