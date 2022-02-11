package com.JFrame111.game.main;

import com.GameStateMananger;

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

    private GameStateMananger gsm;

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

        gsm = new GameStateMananger();
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
        gsm.tick();

    }


    public void paintComponent(java.awt.Graphics g) {
super.paintComponent(g);


g.clearRect(0, 0, WIDTH, HEIGHT);

    }
    public void keyTyped(KeyEvent g) {

    }


    public void keyPressed(KeyEvent g) {
        gsm.keypressed(g.getKeyCode());

    }


    public void keyReleased(KeyEvent g) {
        gsm.keyReleased(g.getKeyCode());
    }
}
