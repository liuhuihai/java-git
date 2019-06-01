package chapter15.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @author liuhuihai
 * @date 2019-05-22 22:52
 * @description 重定向输出流测试
 */
public class RedirectOutTest {
    public static void main(String[] args) {
        try(PrintStream ps = new PrintStream(new FileOutputStream("outTest.txt"));){
            System.setOut(ps);
            System.setErr(ps);
            System.out.println("测试重定向输出流！");
            System.out.println("测试重定向错误输出流！");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
