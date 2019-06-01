package chapter15.io;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * @author liuhuihai
 * @date 2019-05-20 23:26
 * @description
 */
public class StringNodeTest {
    public static void main(String[] args) {
        String source = "故事    " + "许巍\n" + "也许是出发太久，" + "我竟然迷失在旅途。\n";
        int hasRead = 0;
        String[] stringArr = new String[6];
        char[] charArr = new char[30];
        try (StringReader sr = new StringReader(source); StringWriter sw = new StringWriter()) {
            while ((hasRead = sr.read(charArr)) > 0) {
                System.out.println(new String(charArr,0,hasRead));
                sw.write("故事里始终都有爱，故事里始终都有光明结局！");
            }
            System.out.println(sw.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
