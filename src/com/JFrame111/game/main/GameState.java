
package com.JFrame111.game.main;


import com.GameStateMananger;

import java.awt.Graphics;

public abstract class GameState<GameStateManager> {

    protected GameStateManager gsm;

    public GameState(GameStateMananger gsm) {

        this.gsm = (GameStateManager) gsm;
        init();
    }

    public abstract void init();
    public abstract void tick();
    public abstract void draw(Graphics g);
    public abstract void keyPressed(int k);
    public abstract void keyReleased(int k);
}
