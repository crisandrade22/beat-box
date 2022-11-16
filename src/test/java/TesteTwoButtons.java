import org.example.ChangeColors;

import javax.swing.*;
import java.awt.*;

public class TesteTwoButtons {
    private JFrame frame;
    private JLabel label;

    public static void main(String[] args) {
        TesteTwoButtons twoButtons = new TesteTwoButtons();
        twoButtons.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton = new JButton(("Change Label"));
        labelButton.addActionListener(event -> label.setText("Ouch!"));

        JButton colorButton = new JButton("Change Color");
        colorButton.addActionListener(event -> frame.repaint());

        label = new JLabel("I'm a label");
        ChangeColors changeColors = new ChangeColors();

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, changeColors);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.NORTH, label);

        frame.setSize(500,400);
        frame.setVisible(true);
    }

}
