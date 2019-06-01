package annotation.functional;

/**
 * @author liuhuihai
 * @date 2019-04-30 22:05
 * @description
 */
public class ImplementMethod implements FunInterface{

    @Override
    public void test() {
        System.out.println("override test FunInterface method!");
    }
}
