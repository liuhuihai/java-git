package throwable;

/**
 * @author liuhuihai
 * @date 2019-04-29 22:05
 * @description finally test
 */
public class FinallyTest {

    public static void main(String[] args) {
        FinallyTest a = new FinallyTest();
        System.out.println(a.test());
    }

    /**
     * 1.finally 中出现return/throw 语句，则try 中的return或者throw 语句将会失效
     * 2.除非try/catch中调用了，强制退出虚拟机的方法，否则finally 方法体都将执行
     *
     * @return
     */
    public boolean test() {
        try {
            return true;
//            throw new ArithmeticException("算术异常！");
//            System.exit(1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //return false;
            throw new NullPointerException("空指针异常！");
        }
    }
}
