import org.example.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TesteChangeColors implements ActionListener {
    private JFrame frame;
    private JButton button;

    public static void main(String[] args) {
        TesteChangeColors gui = new TesteChangeColors();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("Change colors");
        button.addActionListener(this);

        ChangeColors changeColors = new ChangeColors();

        frame.getContentPane().add(BorderLayout.CENTER, changeColors);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.setSize(300,300);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       frame.repaint();
    }
}
