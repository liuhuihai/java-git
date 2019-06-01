package throwable;

/**
 * @author liuhuihai
 * @date 2019-04-29 23:51
 * @description 线程异常测试
 */
public class ThreadExceptionTest implements Runnable {
    @Override
    public void run() {
        firstMethod();
    }

    public void firstMethod() {
        secondMethod();
    }

    public void secondMethod() {
        int a = 5;
        int b = 0;
        int c = a / b;
    }

    public static void main(String[] args) {
        System.out.println("Main Method!");
        new Thread(new ThreadExceptionTest()).start();
    }
}
