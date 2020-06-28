package homework.swing.ex2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui implements ActionListener {
    JButton button;
    public static void main(String[] args) {
        SimpleGui simpleGui = new SimpleGui();
        simpleGui.go();



    }
    public void go(){
        JFrame frame = new JFrame();
        button=new JButton("Click");
        button.addActionListener(this);
        MyDrawPanel myDrawPanel = new MyDrawPanel();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("I've been clicked!");
    }
}
