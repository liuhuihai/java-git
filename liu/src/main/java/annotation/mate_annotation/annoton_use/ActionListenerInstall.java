package annotation.mate_annotation.annoton_use;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;

/**
 * @author liuhuihai
 * @date 2019-05-08 22:49
 * @description
 */
public class ActionListenerInstall {

    public static void processAnnotations(Object obj) throws IllegalAccessException, InstantiationException {
        try {
            Class cl = obj.getClass();
            for (Field f : cl.getDeclaredFields()) {
                f.setAccessible(true);
                ActionListenerFor a = f.getAnnotation(ActionListenerFor.class);
                Object fObj = f.get(obj);
                if (a != null && fObj != null && fObj instanceof AbstractButton) {
                    Class<? extends ActionListener> listenerClazz = a.listener();
                    ActionListener al = listenerClazz.newInstance();
                    AbstractButton ab = (AbstractButton) fObj;
                    ab.addActionListener(al);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
