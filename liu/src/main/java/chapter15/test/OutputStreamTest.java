package chapter15.test;

import java.io.*;

/**
 * @author liuhuihai
 * @date 2019-06-17 22:47
 */
public class OutputStreamTest {
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("/Users/liuhuihai/IdeaProjects/liu/src/main/java/chapter15/test/InputStreamTest.java");
             OutputStream os = new FileOutputStream("outputTest.txt")) {
            int hasRead = 0;
            byte[] bbuf = new byte[1024];
            while ((hasRead = is.read(bbuf)) > 0) {
                if (hasRead > 0) {
                    os.write(bbuf,0,hasRead);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
