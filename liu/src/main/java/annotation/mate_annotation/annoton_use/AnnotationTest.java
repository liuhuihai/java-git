package annotation.mate_annotation.annoton_use;

import javax.swing.*;

/**
 * @author liuhuihai
 * @date 2019-05-08 22:39
 * @description 注解测试
 */
public class AnnotationTest {
    private JFrame mainWin =new JFrame("使用注解绑定事件监听器");
    @ActionListenerFor(listener = OkListener.class)
    private JButton ok = new JButton("确定");
    @ActionListenerFor(listener = CancelListener.class)
    private JButton cancel = new JButton("取消");
    public void init() throws InstantiationException, IllegalAccessException {
        JPanel jp = new JPanel();
        jp.add(ok);
        jp.add(cancel);
        mainWin.add(jp);
        ActionListenerInstall.processAnnotations(this);
        mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWin.pack();
        mainWin.setVisible(true);
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        new AnnotationTest().init();
    }

}
