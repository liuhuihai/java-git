package chapter15.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * @author liuhuihai
 * @date 2019-05-22 22:58
 * @description 测试重定向输入流
 */
public class RedirectInput {
    public static void main(String[] args) {
        try(InputStream is = new FileInputStream("/Users/liuhuihai/IdeaProjects/liu/src/main/java/chapter15/io/RedirectInput.java")){
            System.setIn(is);
            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()){
                System.out.println("键盘输入的内容是："+sc.next());
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
