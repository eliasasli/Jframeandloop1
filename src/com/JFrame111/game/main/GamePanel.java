package com.JFrame111.game.main;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable, KeyListener {
    private static final long serialVersionUID = 1L;

    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;

    private Thread thread;
    private boolean isRunning = false;

    private int FPS = 60;
    private long targetTime = 1000 / FPS;

    public GamePanel(){
    setPreferredSize(new Dimension(WIDTH, HEIGHT));



    }

    private void start(){
        isRunning = true;
        thread = new Thread(this);
        thread.start();

    }

    public void run() {
        long start, elapsed, wait;
while(isRunning) {

start = System.nanoTime();



tick();
repaint();

elapsed = System.nanoTime() - start;
    wait = (targetTime - elapsed) / 1000000;


if (wait <= 0) {
    wait = 5;
}
try{
    Thread.sleep(wait);
} catch(Exception e){
    e.printStackTrace();
}
}
    }
    public void tick() {

    }


    public void paintComponent(java.awt.Graphics g) {
super.paintComponent(g);


    }
    public void keyTyped(KeyEvent keyEvent) {

    }


    public void keyPressed(KeyEvent keyEvent) {

    }


    public void keyReleased(KeyEvent keyEvent) {

    }
}
