package brickbraker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Gameplay extends JPanel implements KeyListener, ActionListener {
    private boolean play = false;
    private int score = 0;

    private int totalBricks = 21;

    private Timer time;
    private int delay = 8;

    private int playerX = 310;

    private int ballposX = 120;
    private int ballposY = 350;
    private int ballXdir = -1;
    private int ballYdir = -2;

    public Gameplay() {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
//        time = new Timer(delay, this);
//        time.start();
    }

    public void paint(Graphics o) {
        //background
        o.setColor(Color.black);
        o.fillRect(1,1, 692, 592);
        //borders
        o.setColor(Color.yellow);
        o.fillRect(0, 0, 3, 592);
        o.fillRect(0,0, 692,592);
        o.fillRect(691,0,3,592);
        //paddle
        o.setColor(Color.green);
        o.fillRect(playerX, 550,100,8);
        //ball
        o.setColor(Color.cyan);
        o.fillRect(ballposX,ballposY,20,20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e){}

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if(playerX >=600) {
                playerX = 600;
            } else {
                moveRight();
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            if(playerX >=10) {
                playerX = 10;
            } else {
                moveLeft();
            }
        }
    }
    public void moveRight() {
        play = true;
        playerX+=20;
    }
    public void moveLeft() {
        play = true;
        playerX-=20;
    }
}
