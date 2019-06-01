package chapter15.file;

import java.io.File;
import java.io.IOException;

/**
 * @author liuhuihai
 * @date 2019-05-08 23:56
 * @description File的常用方法
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
//        //以当前路径来创建File对象
        File file = new File("/Users/liuhuihai/IdeaProjects/liu/src/main/java/chapter15/file/feli.txt.");
//        //输出文件名/Users/liuhuihai/Downloads/apache-maven-3.6.1
        System.out.println(file.getName());
        file.createNewFile();
        //父路径
//        System.out.println(file.getParent());
//        System.out.println(file.getAbsoluteFile());
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.getAbsoluteFile().getParent());
        //以当前路径来创建File对象
//        File file = new File(".");
        //输出文件名
        System.out.println(file.getName());
        //父路径
        System.out.println(file.getParent());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getAbsoluteFile().getParent());
        System.out.println(file.exists());
        File tempFile = File.createTempFile("aaa",".txt",new File("."));
        tempFile.deleteOnExit();
        String[] fileList = file.list();
        System.out.println("ls");
        for(String l : fileList){
            System.out.println(l);
        }
        System.out.println("listRoots");
        File[] s = File.listRoots();
        for (File f : s){
            System.out.println(f);
            System.out.println(f.toString());
        }
    }
}
