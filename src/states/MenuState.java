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

        uiManager.addObject(new UIImageButton(250, 200, 750, 52, Assets.startButton, new ClickListener() {
            @Override
            public void onLeftClick() {
                State.setState(handler.getGame().gameState);
                handler.getMouseManager().setUIManager(null);
            }

            @Override
            public void onRightClick() {

            }
        }));

        uiManager.addObject(new UIImageButton(250, 275, 750, 52, Assets.endButton, new ClickListener() {
            @Override
            public void onLeftClick() {
                State.setState(handler.getGame().editorState);
                handler.getMouseManager().setUIManager(null);
            }

            @Override
            public void onRightClick() {

            }
        }));

    }

    @Override
    public void tick() {
        if (handler.getMouseManager().getUIManager() != this.uiManager)
            handler.getMouseManager().setUIManager(uiManager);
//        if (!handler.getMouseManager().containsUIManager(uiManager))
//            handler.getMouseManager().addUIManager(uiManager);
        uiManager.tick();
    }

    @Override
    public void render(Graphics g) {
        uiManager.render(g);
    }
}
