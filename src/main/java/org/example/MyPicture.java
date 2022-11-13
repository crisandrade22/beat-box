package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class MyPicture  extends JPanel{
    public void paintComponent(Graphics g) {
        Image image = new ImageIcon("/home/cristiane/workspace/beat-box/src/main/java/org/example/gatinho").getImage();
        g.drawImage(image, 3, 4, (ImageObserver) this);
    }

}
