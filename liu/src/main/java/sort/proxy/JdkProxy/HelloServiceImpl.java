package sort.proxy.JdkProxy;

/**
 * @author liuhuihai
 * @date 2019-04-10 21:28
 * @description shixain class
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String name) {
        System.out.println("name: " + name);
    }
}
