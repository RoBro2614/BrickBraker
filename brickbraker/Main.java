package brickbraker;

import javax.swing.JFrame;


public class Main {

    public static void main(String[] args) {
        //JFrame class object from javax.swing.JFrame
        JFrame window = new JFrame();
        //using setBounds method from JFrame object (window)
        Gameplay gamePlay = new Gameplay();

        window.setBounds(10, 10, 700, 600);
        //using setTitle method to set title for the game
        /**
         * @param title string: "Breakout Ball"
         */
        window.setTitle("Breakout Ball");
        window.setResizable(false);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(gamePlay);


    }
}

