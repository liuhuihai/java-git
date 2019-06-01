package sort.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author liuhuihai
 * @date 2019-04-15 22:26
 * @description cglib Proxy
 */
public class CglibProxy implements MethodInterceptor {

    private Object target;

    public CglibProxy() {
    }

    public CglibProxy(Object target) {
        this.target = target;
    }

    public Object getInstance() {
        Enhancer enc = new Enhancer();
        enc.setSuperclass(this.target.getClass());
        enc.setCallback(this);
        return enc.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("====Cglib代理=====");
        System.out.println("准备说hello world！");
        Object obj = methodProxy.invokeSuper(o, objects);
        System.out.println("说完了！");
        return obj;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }
}

