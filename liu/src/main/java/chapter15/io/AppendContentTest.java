package chapter15.io;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author liuhuihai
 * @date 2019-05-24 00:29
 * @description 让文件末尾增加内容
 */
public class AppendContentTest {
    public static void main(String[] args) {
        try (RandomAccessFile rsf =
                     new RandomAccessFile("/Users/liuhuihai/IdeaProjects/liu/src/main/java/chapter15/io/AppendContentTest.java", "rws")) {
            rsf.seek(rsf.length());
            rsf.writeBytes("//append content！hello Java");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}//append contenthello Java//append contenthello Java//append contenthello Java//append contenthello Java