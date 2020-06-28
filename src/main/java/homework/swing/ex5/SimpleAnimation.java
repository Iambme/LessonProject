package homework.swing.ex5;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleAnimation {
    JFrame frame;
    JLabel label;
    int x = 10;
    int y = 20;

    public static void main(String[] args) {
        SimpleAnimation simpleAnimation = new SimpleAnimation();
        simpleAnimation.go();

    }


    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JButton labelButton = new JButton("Change Label");
        labelButton.addActionListener(new LabelListener());

        JButton colorButton = new JButton("Change Color");
        colorButton.addActionListener(new ColorListener());
        label = new JLabel("I am Label");

        MyDrawPanel myDrawPanel = new MyDrawPanel();
        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, myDrawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setSize(300, 300);
        frame.setVisible(true);
        for (int i = 0; i <70 ; i++) {
            x++;
            y+=2;
            myDrawPanel.repaint();
            try{
                Thread.sleep(50);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }


    }

    class LabelListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Ouch!");
        }
    }

    class ColorListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }

    public class MyDrawPanel extends JPanel {

        public void paintComponent(Graphics g) {
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            int red = (int) (Math.random() * 255);
            int green = (int) (Math.random() * 255);
            int blue = (int) (Math.random() * 255);

            Color randomColor = new Color(red, green, blue);
            g.setColor(randomColor);
            g.fillOval(x, y, 50, 50);
        }
    }
}
