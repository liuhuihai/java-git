package chapter15.io;

import java.io.*;

/**
 * @author liuhuihai
 * @date 2019-05-24 00:36
 * @description
 */
public class InsertContent {
    public static void main(String[] args) throws IOException {
        File temp = File.createTempFile("tmp", "temp");
        temp.deleteOnExit();
        try (
                RandomAccessFile rsf = new RandomAccessFile("thisText.txt", "rws");
                FileInputStream fis = new FileInputStream(temp);
                FileOutputStream fos = new FileOutputStream(temp)) {
/**
 * 直接往代码里面插入数据不行，会覆盖 插入位置 后面的内容
 *  rsf.seek(rsf.length()/2);
 * rsf.writeBytes("//append content!hello Java");
 *
 * 应该先把插入点后面的文件读入缓冲区，追星插入操作，再把缓冲区的内容追加在后面
 * 代码如下：
 */
            long pos = rsf.length() / 2;
            System.out.println("insert位置：" + rsf.length() / 2);
            rsf.seek(pos);
            byte[] bbuf = new byte[12];
            int hasRead = 0;
            while ((hasRead = rsf.read(bbuf)) > 0) {
                fos.write(bbuf, 0, hasRead);
            }
            System.out.println("存储之后指针的位置：" + rsf.getFilePointer());
            rsf.seek(pos);
            rsf.write("//test insert content ".getBytes());
            while((hasRead = fis.read(bbuf))> 0){
                rsf.write(bbuf,0,hasRead);
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

}
