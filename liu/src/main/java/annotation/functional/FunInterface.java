package annotation.functional;

//该注解修饰函数式接口
@FunctionalInterface
public interface FunInterface {
    static void foo() {
        System.out.println("This is a Static Method of Interface named FunInterface");
    }

    default void defaultTest() {
        System.out.println("This is a Defalut Method of Interface named FunInterface");
    }

    /**
     * target method
     */
    void test();
}
