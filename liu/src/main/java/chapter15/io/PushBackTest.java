package chapter15.io;

import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

/**
 * @author liuhuihai
 * @date 2019-05-21 22:46
 * @description 推回缓冲流测试
 */
public class PushBackTest {
    public static void main(String[] args) {
        try (PushbackReader pr = new PushbackReader
                (new FileReader("/Users/liuhuihai/IdeaProjects/liu/src/main/java/chapter15/io/PushBackTest.java"), 1)) {
            char[] bbuf = new char[32];
            int hasRead = 0;
            String lastContent = null;
            while ((hasRead = pr.read(bbuf)) > 0) {
                //将读取的内容转化为字符串
                String content = new String(bbuf, 0, hasRead);
                System.out.println("第一次读取的内容：");
                System.out.println(content);
                int targetIndex = 0;
                //将上次读取的字符串和本次读取的字符串拼起来
                //查看是否包含目标字符串，如果包含目标字符串
                if ((targetIndex = (lastContent + content).indexOf("new PushbackReader")) > 0) {
                    System.out.println(targetIndex);
                    //将本次内容和上次内容一起推回缓冲区
                    pr.unread(2);
                    //重新定义一个长度为 targetIndex 的 char 数组
                    if (targetIndex > 32) {
                        bbuf = new char[targetIndex];
                    }
                    //再次读取制定长度的内容（就是目标字符串之前的内容）
                    pr.read(bbuf, 0, targetIndex);
                    //打印读取的内容
                    System.out.println("这次读取的内：");
                    System.out.println(new String(bbuf, 0, targetIndex));
                    System.exit(0);
                } else {
                    //打印上次读取的内容
                    System.out.println("上次读取的内容：");
                    System.out.println(lastContent);
                    //将本次内容设为上次读取的内容
                    lastContent = content;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
