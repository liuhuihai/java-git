package chapter15.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @author liuhuihai
 * @date 2019-05-20 22:48
 * @description printStreamTest
 */
public class PrintStreamTest {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("test.txt");
             PrintStream ps = new PrintStream(fos);)
        {
            ps.println("普通字符串！");
            ps.print(new PrintStreamTest());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
