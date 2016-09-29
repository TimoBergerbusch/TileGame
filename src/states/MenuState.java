package states;

import java.awt.*;
import java.awt.image.BufferedImage;

import gfx.Assets;
import tilegame.Game;
import tilegame.Handler;
import ui.ClickListener;
import ui.UIImageButton;
import ui.UIManager;

public class MenuState extends State {

    private UIManager uiManager;

    public MenuState(Handler handler) {
        super(handler);
        uiManager = new UIManager(handler);
        handler.getMouseManager().setUIManager(uiManager);

        uiManager.addObject(new UIImageButton(200, 200, 256, 64, new BufferedImage[]{Assets.grass, Assets.roundBush}, new ClickListener() {
            @Override
            public void onClick() {
                State.setState(handler.getGame().gameState);
                handler.getMouseManager().setUIManager(null);
            }
        }));
    }

    @Override
    public void tick() {
        uiManager.tick();
    }

    @Override
    public void render(Graphics g) {
        uiManager.render(g);
    }
}
