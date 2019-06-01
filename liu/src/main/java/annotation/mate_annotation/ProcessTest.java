package annotation.mate_annotation;

import java.lang.reflect.Method;

/**
 * @author liuhuihai
 * @date 2019-05-07 00:02
 * @description ceshi
 */
public class ProcessTest {

    public static void process(String clazz) throws ClassNotFoundException {
        int passed = 0;
        int failed = 0;
        for (Method m : Class.forName(clazz).getMethods()) {
            if (m.isAnnotationPresent(Testable.class)) {
                try {
                    m.invoke(null);
                    passed++;
                } catch (Exception ex) {
                    System.out.println("方法" + m + "运行失败，异常：" + ex.getCause());
                    failed++;
                }
            }
        }
        System.out.println("共运行了" + (passed + failed) + "次,失败了" + failed + "次，" + "成功了" + passed + "次");
    }
}
