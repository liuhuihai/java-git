package chapter15.serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author liuhuihai
 * @date 2019-05-25 23:19
 */
public class ReadObject {

    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/liuhuihai/IdeaProjects/object.txt"))) {
            Person p = (Person) ois.readObject();
            System.out.println(p.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
