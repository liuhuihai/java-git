package annotation.mate_annotation;

/**
 * @author liuhuihai
 * @date 2019-05-06 23:59
 * @description 测试用例
 */
public class MyTest {
    @Testable
    public static void m1(){
    }

    public static void m2(){
    }

    @Testable
    public static void m3(){
    }

    @Testable
    public static void m4(){
        throw new IllegalArgumentException("参数出错！");
    }

    public static void m5(){
    }

    public static void m6(){
    }

    public static void m7(){
    }

    @Testable
    public static void m8(){
        throw new NullPointerException("第八个方法！");
    }
}
