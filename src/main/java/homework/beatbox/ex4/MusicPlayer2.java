package homework.beatbox.ex4;


import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;

public class MusicPlayer2 {
    static JFrame f = new JFrame("Music with graphic");
    static MyDrawPanel ml;
    public static void main(String[] args) {
        MusicPlayer2 mini = new MusicPlayer2();
        mini.go();


    }
    public void setUpGui(){
        ml = new MyDrawPanel();
        f.setContentPane(ml);
        f.setBounds(30,30,300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void go() {
        setUpGui();
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            int[] eventsIWant = {127};
            sequencer.addControllerEventListener(ml, eventsIWant);
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();
            for (int i = 5; i < 61; i += 4) {
                track.add(makeEvent(144, 1, i, 100, i));
                track.add(makeEvent(176, 1, 127, 0, i));
                track.add(makeEvent(128, 1, i, 100, i + 2));

            }

            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(220);
            sequencer.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;

        try {
            ShortMessage a = new ShortMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
        return event;
    }


    class MyDrawPanel extends JPanel implements ControllerEventListener{
        boolean msg = false;


        @Override
        public void controlChange(ShortMessage event) {
        msg = true;
        repaint();
        }
        public void paintComponent(Graphics g){
            if(msg){
                Graphics2D g2 = (Graphics2D)g;
                
                int r = (int)(Math.random()*255);
                int gr = (int)(Math.random()*255);
                int b = (int)(Math.random()*255);

                g.setColor(new Color(r,gr,b));

                int ht = (int)((Math.random()*120)+10);
                int wh = (int)((Math.random()*120)+10);
                int x = (int)((Math.random()*40)+10);
                int y = (int)((Math.random()*40)+10);
                g.fillRect(x,y,wh,ht);
                msg = false;
            }
        }
    }
}
