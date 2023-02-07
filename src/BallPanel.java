import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class BallPanel extends JPanel {
    // Fields
    int x = 100;
    int xSpeed = 3;
    int y = 50;
    int ySpeed = 3;

    int height;
    int width;






    Ball balls = new Ball(50,50,100,3,3);

    Ball bill;

    // Constructor
    public BallPanel() {
        setFocusable(true);
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }


            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                int keyCode = e.getKeyCode();
                if(keyCode == 68) {
                    balls.moveRight();
                }
                else if (keyCode == 87) {
                    balls.moveUp();
                }
                else if(keyCode == 65) {
                    balls.moveLeft();
                }
                else if(keyCode == 83) {
                    balls.moveDown();
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        setBackground(new Color(31,206,176));
        bill = new Ball(50,50,100,3,3);
    }





    // Methods

    public int getHeight() {
        height = y;
        return height;
    }
    public int getWidth() {
        width = x;
        return width;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        balls.drawBall(g);


       // if(x >= width - 20 || x <= 0) {
       //     xSpeed *= -1;
      //  }

      //  else if(y >= height - 20 || y <= 0) {
       //     ySpeed *= -1;
       // }


        try
        {
            Thread.sleep(10);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }





repaint();
    }





}