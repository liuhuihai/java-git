package sort.proxy.cglib;

/**
 * @author liuhuihai
 * @date 2019-04-15 22:43
 * @description cglib proxy Test
 */
public class CglibProxyTest {
    public static void main(String[] args) {
        Test test = new Test();
        CglibProxy cglibProxy = new CglibProxy(test);
        Test obj = (Test)cglibProxy.getInstance();
        obj.sayHello("Hello Wrold!");

    }

}
