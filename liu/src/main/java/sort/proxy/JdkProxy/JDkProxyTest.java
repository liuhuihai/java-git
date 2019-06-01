package sort.proxy.JdkProxy;

/**
 * @author liuhuihai
 * @date 2019-04-10 21:48
 * @description JDK 代理测试
 */
public class JDkProxyTest {
    public static void main(String[] args) {
        HelloServiceProxy helloServiceProxy = new HelloServiceProxy();
        HelloService helloService = (HelloService) helloServiceProxy.bind(new HelloServiceImpl());
        helloService.sayHello("Hello World!");

        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratorFiles",true);
        HelloService hello = new HelloServiceProxy(new HelloServiceImpl()).getProxy();
        hello.sayHello("Hello JDK 代理！");
    }

}
