import org.example.MyDrawPanel2;

import javax.sound.midi.*;
import javax.swing.*;
import java.util.Random;

import static javax.sound.midi.ShortMessage.*;

public class MiniMusicPlayer3 {
    private MyDrawPanel2 panel;
    private Random random = new Random();

    public static void main(String[] args) {
        MiniMusicPlayer3 gui = new MiniMusicPlayer3();
        gui.go();
    }

    public void setUpGui() {
        JFrame frame = new JFrame("My First Music Video");
        panel = new MyDrawPanel2();
        frame.setContentPane(panel);
        frame.setBounds(30, 30, 300, 300);
        frame.setVisible(true);

    }
    public void go() {
        setUpGui();

        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addControllerEventListener(panel, new int[]{127});

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            int note;
            for (int i = 0; i < 60; i += 4) {
//                note = random.nextInt(50) + 1;
                note = 22;
                System.out.println(note);
                track.add(makeEvent(NOTE_ON, 1, note, 100, i));
                track.add(makeEvent(CONTROL_CHANGE, 1, 127, 0, i));
                track.add(makeEvent(NOTE_OFF, 1, note, 100, i + 2));
            }
            sequencer.setSequence(seq);
            sequencer.start();
            sequencer.setTempoInBPM(120);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static MidiEvent makeEvent(int cmd, int chn1, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage msg = new ShortMessage();
            msg.setMessage(cmd, chn1, one, two);
            event = new MidiEvent(msg, tick);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return event;
    }
}
