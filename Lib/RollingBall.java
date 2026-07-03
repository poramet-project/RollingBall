package Lib;
import java.awt.*;
import javax.swing.*;
public class RollingBall extends JPanel{
    @Override
    protected void paintComponent(Graphics g) {
        g.drawOval(100, 90, 80,80);
        g.fillArc(100, 90, 80, 80, 0, 180);
    }
}