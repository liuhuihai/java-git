package chapter15.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author liuhuihai
 * @date 2019-05-22 23:37
 * @description 读取其他进程的信息
 */
public class ReadFromProcess {
    public static void main(String[] args) throws IOException {
        Process p = Runtime.getRuntime().exec("java -version");
//        Process process = new ProcessBuilder().start();

        try(BufferedReader br = new BufferedReader(new InputStreamReader(p.getErrorStream()))){
            String buff = null;
            while((buff = br.readLine()) != null){
                System.out.println(buff);
            }
        }
    }
}
