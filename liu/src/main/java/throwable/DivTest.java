package throwable;

/**
 * @author liuhuihai
 * @date 2019-04-29 21:27
 * @description simple test
 */
public class DivTest {
    public static void main(String[] args) {
        try {
            int[] ary = new int[1];
            int a = ary[0];
            int b = ary[1];
            int c = a / b;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("数组越界，运行时输入的参数不够！");
        } catch (ArithmeticException e) {
            System.out.println("算数异常");
        } catch (Exception e) {
            System.out.println("未知异常！");
        }
    }
}
