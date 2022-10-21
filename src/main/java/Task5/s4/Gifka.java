package Task5.s4;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Gifka {
    static JFrame frame;
    public static void main(String args[]) throws IOException, InterruptedException {
        frame = new JFrame();
        frame.setTitle("gifka");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 800);
        final BufferedImage image1 = ImageIO.read(new File(args[0]));
        final BufferedImage image2 = ImageIO.read(new File(args[1]));
        JPanel pane1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image1, 0, 0, null);
            }
        };

        JPanel pane2 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image2, 0, 0, null);
            }
        };
        frame.add(pane1);

        frame.setVisible(true);

        for (int i = 0;; ++i, i%=2) {
            frame.getContentPane().getComponent(0).setVisible(false);
            if (i % 2 == 0) {
                changeImage(pane1, pane2);
            }
            else {
                changeImage(pane2, pane1);
            }
            frame.getContentPane().getComponent(0).setVisible(true);
            TimeUnit.MILLISECONDS.sleep(300);
        }
    }

    public static void changeImage(JPanel pane1, JPanel pane2) {
        frame.remove(pane1);
        frame.add(pane2);
    }
}
