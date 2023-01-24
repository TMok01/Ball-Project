import javax.swing.*;
import java.awt.*;
public class DrawPanel extends JPanel {
    // Fields






    // Constructor
    public DrawPanel() {
        setBackground(new Color(31,206,176));
    }





    // Methods
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.fillOval(100,100,100,100);
    }

}