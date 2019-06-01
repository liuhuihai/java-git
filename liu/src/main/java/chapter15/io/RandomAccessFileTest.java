package chapter15.io;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author liuhuihai
 * @date 2019-05-24 00:17
 * @description 任意访问文件测试
 */
public class RandomAccessFileTest {
    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("/Users/liuhuihai/IdeaProjects/liu/src/main/java/chapter15/io/RandomAccessFileTest.java", "r")) {
            //获取文件指针位置
            System.out.println("文件指针的初始位置：" + raf.getFilePointer());
            raf.seek(120);
            System.out.println("移动后的文件指针位置：" + raf.getFilePointer());
            byte[] bbuf = new byte[10];
            int hasRead = 0;
            while ((hasRead = raf.read(bbuf)) > 0) {
                System.out.println("读取的内容："+new String(bbuf,0,hasRead));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
