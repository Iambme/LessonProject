package homework.swing.ex2;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g){
        g.setColor(Color.CYAN);
        g.fillRect(20,30,50,50);
    }
}
