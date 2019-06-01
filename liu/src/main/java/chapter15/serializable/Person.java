package chapter15.serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author liuhuihai
 * @date 2019-05-24 22:34
 * @description
 */
@Getter
@Setter
@ToString
public class Person implements Serializable {
    private static final long serialVersionUID = 4814002237465423822L;

    private String name;
    private int age;

    public Person(){

    }
    public Person(String name ,int age){
        this.name = name;
        this.age = age;
    }

}
