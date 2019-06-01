package chapter15.io;

import java.io.*;

/**
 * @author liuhuihai
 * @date 2019-05-17 00:52
 * @description FileReadTest
 */
public class FileReaderTest {

    public static void main(String[] args) {
        //创建输入流
        try (
                Reader reader = new FileReader("/Users/liuhuihai/IdeaProjects/liu/src/main/java/chapter15/io/FileReaderTest.java");
                Writer writer = new FileWriter("writer.txt");
        ) {
            //创建输入流的桶
            char[] cbuf = new char[512];
            //记录读取的字符
            int hasRead = 0;
            System.out.println("测试输入流：");
            while ((hasRead = reader.read(cbuf)) > 0) {
                System.out.println(new String(cbuf));
                //输出到磁盘
                writer.write(cbuf, 0, hasRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}