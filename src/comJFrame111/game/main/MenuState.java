package comJFrame111.game.main;

import com.GameStateMananger;
import com.JFrame111.game.main.GamePanel;
import com.JFrame111.game.main.GameState;

import java.awt.*;

public class MenuState extends GameState {

    private String[] options = {"Start", "Help", "Quit"};
private int currentSelection = 0;

    public MenuState(GameStateMananger gsm) {
        super(gsm);
    }

    public void init() {}

    public void tick() {

    }




    public void draw(Graphics g) {

        for (int i = 0; i < options.length; i++) {
            if(i == currentSelection) {
    g.setColor(Color.GREEN);
} else {
    g.setColor(Color.BLACK);
}
g.drawString(options[i], GamePanel.WIDTH / 2 - 50, 50 + i *30);
        }

    }


    public void keyPressed(int k) {

    }


    public void keyReleased(int k) {

    }
}
