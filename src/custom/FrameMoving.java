package custom;

import javax.swing.*;
import java.awt.event.*;

public class FrameMoving {

    private static int x;
    private static int y;

    public static void initMoving(JFrame frame) {

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                x = me.getX();
                y = me.getY();
            }
        });
        frame.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                frame.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
            }
        });
    }
}
