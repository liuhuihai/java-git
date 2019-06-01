package annotation.mate_annotation;

import java.lang.annotation.Annotation;

/**
 * @author liuhuihai
 * @date 2019-05-06 23:36
 * @description 获取修饰某个类的所有注解
 */
public class getAnno {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        TestAnnotation a = new TestAnnotation();
        Annotation[] ann = a.getClass().getMethod("info").getAnnotations();
        for (Annotation an : ann) {
            System.out.println(an);
        }
//        Annotation[] ary = Class.forName("Base").getAnnotations();
//        Annotation test = Class.forName("Base").getAnnotation(Annotation.class);
//        System.out.println(test);
//        for (Annotation a : ary) {
//            System.out.println(a);
//        }
    }
}
