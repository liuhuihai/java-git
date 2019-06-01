package chapter15.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @author liuhuihai
 * @date 2019-05-17 00:41
 * @description FileWriter 测试
 */
public class FileWriterTest {

    public static void main(String[] args) {
        try(Writer writer = new FileWriter("锦瑟.txt")){
            writer.write("      锦瑟  - 李商隐\n");
            writer.write("锦瑟无端五十弦，一弦一柱思年华。\n");
            writer.write("庄生晓梦迷蝴蝶，望帝春心托杜鹃。\n");
            writer.write("沧海月明珠有泪，和田玉暖玉生烟。\n");
            writer.write("此情可待成追忆，只是当时已惘然。\n");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
