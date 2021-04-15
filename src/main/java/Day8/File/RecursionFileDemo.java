package Day8.File;

import java.io.File;

public class RecursionFileDemo {
    public static void main(String[] args) {
        File file=new File("E:\\java学习");
        getAllFile(file);
    }
    public static File getAllFile(File file1){
        File []files =file1.listFiles();
        if (files!=null){
        for (File file:files){
                if (file.isDirectory()){
                    getAllFile(file);
                }
                else {
                    System.out.println(file.getAbsoluteFile());
                }

            }
        }

        return file1;

    }
}
