package annotation.mate_annotation.annoton_use;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author liuhuihai
 * @date 2019-05-08 22:42
 * @description
 */
public class OkListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null,"单击了确认按钮！");
    }
}
