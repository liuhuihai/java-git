package chapter15.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author liuhuihai
 * @date 2019-05-25 22:11
 */
public class WriterObject {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.txt"))) {
            Person p = new Person("孙悟空",50000);
            oos.writeObject(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
