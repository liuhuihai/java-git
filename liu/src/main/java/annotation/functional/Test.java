package annotation.functional;

/**
 * @author liuhuihai
 * @date 2019-04-30 22:03
 * @description test
 */
public class Test {
    static void fun(FunInterface f) {
        f.test();
    }

    public static void main(String[] args) {
        Test test = new Test();
        Test.fun(new FunInterface() {
            @Override
            public void test() {
                System.out.println("test");
            }
        });

        Test.fun(() -> {
            System.out.println("This is lambda!");
        });
    }
}
