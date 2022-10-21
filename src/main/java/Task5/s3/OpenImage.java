package Task5.s3;

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

public class OpenImage {
    static JFrame frame;
    public static void main(String args[]) throws IOException, InterruptedException {
        frame = new JFrame();
        frame.setTitle("openImage");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 800);
        final BufferedImage image1 = ImageIO.read(new File(args[0]));
        JPanel pane1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image1, 0, 0, null);
            }
        };
        frame.add(pane1);
        frame.setVisible(true);
    }

}
