package Task5.s1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Footbal {
    private static int milanGol = 0;
    private static int madridGol = 0;

    public static String getWinner() {
        if (milanGol == madridGol) {
            return "DRAW";
        }
        if (milanGol > madridGol) {
            return "AC Milan";
        }
        return "Real Madrid";
    }

    public static void main(String args[]){
        JFrame frame = new JFrame("Football");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);
        JPanel panel= new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize( new Dimension(200,300));
        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");
        JLabel commonScore = new JLabel("Result: 0 X 0");
        JLabel lastScorer = new JLabel("Last Scorer: N/A");
        JLabel winner = new JLabel("Winner: DRAW");
        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanGol++;
                commonScore.setText("Result: " + milanGol + " X " + madridGol);
                lastScorer.setText("Last Scorer: AC Milan");
                winner.setText("Winner: " + getWinner());
            }
        });

        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridGol++;
                commonScore.setText("Result: " + milanGol + " X " + madridGol);
                lastScorer.setText("Last Scorer: Real Madrid");
                winner.setText("Winner: " + getWinner());
            }
        });
        panel.add(milanButton);
        panel.add(madridButton);
        panel.add(commonScore);
        panel.add(lastScorer);
        panel.add(winner);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
