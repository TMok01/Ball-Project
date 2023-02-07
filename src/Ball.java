import javax.swing.*;
import java.awt.*;
public class Ball {
    // Fields
    private int x, y, size, xSpeed, ySpeed;
    private Color color;



    // Constructor

    public Ball(int x, int y, int size, int xSpeed, int ySpeed) {
        this.x = (int)(Math.random()*480);
        this.y = (int)(Math.random()*280);
        this.size = size;
        this.xSpeed = (int)(Math.random()*1);
        this.ySpeed = (int)(Math.random()*1);
    }

    // Methods
    public void drawBall(Graphics wall) {
        wall.fillOval(x, y, size, size);
    }
    public void moveRight() {
        x += 10;
    }
    public void moveLeft() {
        x -= 10;
    }
    public void moveUp() {
        y -= 10;
    }
    public void moveDown() {
        y +=10;
    }

    public void moveBall() {
        x += xSpeed;
        y += ySpeed;
        //if(x >= panel.getWidth() - 20 || x <=0) {
           // xSpeed *= -1;
       // }
        //else if(y >= panel.getHeight() - 20 || y <= 0) {
           // ySpeed *= -1;
        }
    }





