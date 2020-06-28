package homework.swing.ex1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton button = new JButton("Click");
        frame.getContentPane().add(button);

        frame.setVisible(true);
        frame.setSize(300,300);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
