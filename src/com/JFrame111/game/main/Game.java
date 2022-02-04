package com.JFrame111.game.main;

import javax.swing.JFrame;
import javax.swing.border.Border;
import java.awt.*;

public class Game {

    public static void main(String [] args) {
        JFrame frame = new JFrame("Platformer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());
        frame.add(new GamePanel(), BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }

}
