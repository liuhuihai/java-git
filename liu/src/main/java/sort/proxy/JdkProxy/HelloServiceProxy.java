package sort.proxy.JdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author liuhuihai
 * @date 2019-04-10 21:30
 * @description Jdk代理实现
 */
public class HelloServiceProxy implements InvocationHandler {

    private Object target;
    public HelloServiceProxy(){}

    public HelloServiceProxy(Object target){
        this.target = target;
    }

    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
    /**
     * 绑定委托代理对象并返回一个代理类
     *
     * @param target
     * @return Object
     */
    public Object bind(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.err.println("======JDK动态代理======");
        Object result = null;
        //反射方法前调用
        System.err.println("我准备想世界说Hello World! ");
        //执行方法
        result = method.invoke(target, args);
        //反射方法后调用
        System.err.println("已经说完了！");
        return result;
    }
}
