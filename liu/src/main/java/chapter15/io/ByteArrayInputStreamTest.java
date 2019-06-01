package chapter15.io;

import java.io.*;

/**
 * @author liuhuihai
 * @date 2019-05-20 23:07
 * @description 字节数组作为物理节点测试
 */
public class ByteArrayInputStreamTest {

    public static void main(String[] args) {
        byte[] byteAry = {0, 3, 2, 4, 5, 3};
        try (InputStream fs = new ByteArrayInputStream(byteAry)) {
            byte[] bbuf = new byte[10];
            int hasRead = 0;
            while ((hasRead = fs.read(bbuf)) > 0) {
                System.out.println(new String(bbuf,0,hasRead));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        char[] charAry = {'0', '3', '2', '4', '5', '3'};
        try (Reader fs = new CharArrayReader(charAry)) {
            char[] bbuf1 = new char[10];
            int hasRead = 0;
            while ((hasRead = fs.read(bbuf1)) > 0) {
                System.out.println(new String(bbuf1,0,hasRead));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
