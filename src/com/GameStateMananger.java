package com;

import com.JFrame111.game.main.GameState;
import comJFrame111.game.main.MenuState;

import java.awt.Graphics;
import java.util.Stack;

public class GameStateMananger {

    private Stack<GameState> states;

    public GameStateMananger() {
states = new Stack<GameState>();
states.push(new MenuState(this));
    }

    public void tick() {
        states.peek().tick();

    }

    public void draw(Graphics g){
        states.peek().draw(g);

    }

    public void keypressed(int k) {
        states.peek().keyPressed(k);

    }

    public void keyReleased(int k){
        states.peek().keyReleased(k);

    }
}
