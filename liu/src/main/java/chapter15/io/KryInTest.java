package chapter15.io;

import java.io.*;

/**
 * @author liuhuihai
 * @date 2019-05-20 23:50
 * @description 转换流
 */
public class KryInTest {
    public static void main(String[] args) {
        try (InputStreamReader reader = new InputStreamReader(System.in);
             OutputStream os = new FileOutputStream("thisText.txt");
             OutputStreamWriter writer = new OutputStreamWriter(os);
             BufferedReader br = new BufferedReader(reader);
             BufferedWriter bw = new BufferedWriter(writer)) {
            String line = null;
            System.out.println("输入的内容为：\n");
            while ((line = br.readLine()) != null) {
                if("exit".equals(line)){
                    System.exit(1);
                }
                bw.write(line);
                bw.flush();
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
