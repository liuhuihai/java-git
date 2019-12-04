package chapter15.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author liuhuihai
 * @date 2019-06-17 22:37
 */
public class InputStreamTest {
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("/Users/liuhuihai/IdeaProjects/liu/src/main/java/chapter15/test/InputStreamTest.java")) {
            byte[] bbuf = new byte[1024];
            int hasRead = 0;
            while ((hasRead = is.read(bbuf)) > 0) {
                if (hasRead > 0) {
                    System.out.println(new String(bbuf, 0, hasRead));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
