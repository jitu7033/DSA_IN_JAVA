import java.awt.*;
import javax.swing.*;


public class pyramid extends JFrame {
    public static void main(String[] args) {
        new pyramid();

    }
    public pyramid()
    {
        setTitle("pyramid");
        setSize(220,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.drawLine(40,140,170,140);
        for(int i=0; i<14; i++){
            g.drawLine(40+5*i, 140-5*i,170-5*i,140-5*i);
            g.setColor(Color.black);
            g.drawString("pyramid",700,160);
        }
    }
}
