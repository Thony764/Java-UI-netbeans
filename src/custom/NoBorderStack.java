package custom;
import javax.swing.*;
import java.awt.*;

public class NoBorderStack {

    public static void removeBorders(JTabbedPane tabbedPane) {
        Insets insets = UIManager.getInsets("TabbedPane.contentBorderInsets");
        insets.top = -1;
        insets.bottom = -1;
        insets.left = -1;
        insets.right = -1;
        UIManager.put("TabbedPane.contentBorderInsets", insets);
    }
}
