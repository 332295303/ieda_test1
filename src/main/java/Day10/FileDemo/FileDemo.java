package Day10.FileDemo;

import java.io.*;

public class FileDemo {

        public static void main(String[] args) throws IOException {
            File srcFolder = new File("E:\\xuexi");
            String srcFolderName = srcFolder.getName();
            System.out.println(srcFolderName+srcFolder.exists());

            File destFolder = new File("myCharStream",srcFolderName);
            if(!destFolder.exists()) {
                System.out.println(destFolder.exists());
                destFolder.createNewFile();
                System.out.println(destFolder.getAbsoluteFile());

                System.out.println( destFolder.mkdir());
            }
            File[] listFiles = srcFolder.listFiles();
            for(File srcFile : listFiles) {
//数据源文件：E:\\itcast\\mn.jpg
//获取数据源文件File对象的名称(mn.jpg)
                String srcFileName = srcFile.getName();
//创建目的地文件File对象，路径名是目的地目录+mn.jpg组成
               // (myCharStream\\itcast\\mn.jpg)
                File destFile = new File(destFolder,srcFileName);

                copyFile(srcFile,destFile);
            }
        }

        private static void copyFile(File srcFile, File destFile) throws IOException {
            BufferedInputStream bis = new BufferedInputStream(new
                    FileInputStream(srcFile));
            BufferedOutputStream bos = new BufferedOutputStream(new
                    FileOutputStream(destFile));
            byte[] bys = new byte[1024];
            int len;
            while ((len=bis.read(bys))!=-1) {
                bos.write(bys,0,len);
            }
            bos.close();
            bis.close();
        }


}
