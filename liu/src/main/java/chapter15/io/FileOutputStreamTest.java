package chapter15.io;

import java.io.*;

/**
 * @author liuhuihai
 * @date 2019-05-17 00:33
 * @description FileOutputStreamTest
 */
public class FileOutputStreamTest {

    public static void main(String[] args) {
        try (
                InputStream is = new FileInputStream("/Users/liuhuihai/IdeaProjects/liu/src/main/java/chapter15/io/FileInputStreamTest.java");
                OutputStream os = new FileOutputStream("newFile.txt");
        ) {
            byte[] bbuf = new byte[1024];
            int hasRead = 0;
            while ((hasRead = is.read(bbuf)) > 0) {
                os.write(bbuf,0,hasRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
