package annotation.mate_annotation;

/**
 * @author liuhuihai
 * @date 2019-05-07 00:09
 * @description 运行测试
 */
public class RunTest {

    public static void main(String[] args) throws ClassNotFoundException {
        ProcessTest.process(MyTest.class.getName());
        System.out.println(MyTest.class.getName());
    }
}
