import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
      System.out.println("Im on replit!!");

        JFrame frame = new JFrame();
        frame.setSize(500,500);


        DrawPanel panel = new DrawPanel();
        BallPanel panel2 = new BallPanel();
        //frame.add(panel);
        frame.add(panel2);



        frame.setVisible(true);
    }
}