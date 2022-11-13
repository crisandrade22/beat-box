package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGuiTestando  implements ActionListener {

    private JFrame frame;
    private JFrame frame2;

    public static void main(String[] args) {
        SimpleGuiTestando gui = new SimpleGuiTestando();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel drawPanel = new MyDrawPanel();
        MyPicture picture = new MyPicture();
        CircleRandomColor randomColor = new CircleRandomColor();
        GradienteColor gradient = new GradienteColor();

        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane();
        frame.setSize(300,300);
        frame.setVisible(true);

        frame.getContentPane().add(randomColor);
        frame.getContentPane();
        frame.setSize(300, 300);
        frame.setVisible(true);

        frame2 = new JFrame();

        frame2.getContentPane().add(BorderLayout.CENTER, gradient);
        frame2.getContentPane();
        frame2.setSize(300, 300);
        frame2.setVisible(true);

        frame2.getContentPane().add(BorderLayout.CENTER, picture);
        frame2.getContentPane();
        frame2.setSize(300,300);
        frame2.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
