package Lib;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RollingBall extends JPanel implements ActionListener {
    int x = 100;
    int Angle = 0;
    public RollingBall() {
        Timer t = new Timer(50, this);
        t.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(x, 90, 80, 80);
        g.fillArc(x, 90, 80, 80, Angle, 180);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x-=2;
        Angle+=2;
        if (x<-80) {
            x = getWidth();
        }
        if (Angle>=360) {
            Angle=0;
        }
        repaint();
    }

}