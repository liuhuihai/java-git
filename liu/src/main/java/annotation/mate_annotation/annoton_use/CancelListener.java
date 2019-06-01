package annotation.mate_annotation.annoton_use;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author liuhuihai
 * @date 2019-05-08 22:44
 * @description
 */
public class CancelListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null,"单击了取消按钮！");
    }
}
