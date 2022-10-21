package Task5.s2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class Random20Figures {

    static class ShapeDrawing extends JComponent {

        public void paint(Graphics g)
        {
            Graphics2D g2 = (Graphics2D) g;
            Color[] colors = new Color[3];
            colors[0] = Color.BLUE;
            colors[1] = Color.RED;
            colors[2] = Color.GREEN;

            for (int i = 0; i < 20; ++i) {
                g2.setColor(colors[i%3]);
                g2.draw(new Rectangle(new Point((int)(Math.random() * 1000), (int)(Math.random() * 500)), new Dimension((int)(Math.random() * 300), 100)));
            }

        }
    }
    public static void main(String args[]){
        JFrame frame = new JFrame("Random figures");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);


        frame.getContentPane().add(new ShapeDrawing());
        frame.pack();
        frame.setVisible(true);
    }
}
