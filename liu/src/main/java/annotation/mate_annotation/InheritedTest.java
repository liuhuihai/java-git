package annotation.mate_annotation;

import java.lang.annotation.Inherited;

/**
 * @author liuhuihai
 * @date 2019-05-01 01:18
 * @description 继承性测试
 */

public class InheritedTest extends Base {

    public static void main(String[] args) {
        System.out.println(InheritedTest.class.isAnnotationPresent(Inheritable1.class));
        System.out.println(Base.class.isAnnotationPresent(Inherited.class));
    }
}
