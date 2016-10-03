package WorldEditor;

import java.awt.*;

import javax.swing.*;

import gfx.GameCamera;
import tilegame.Handler;
import ui.*;
import ui.UIManager;

public class WorldEditor {

    private Handler handler;
    private WorldEditorPanel worldEditorPanel;
    private WorldControls worldControls;
    public UIManager uiManager;

    public WorldEditor(Handler handler) {
        this.handler = handler;
        uiManager = new UIManager(handler);
        worldEditorPanel = new WorldEditorPanel(handler, this, "res/worlds/world1.lvl");
        worldControls = new WorldControls(handler, this, worldEditorPanel);
    }

    public void tick() {
        if (handler.getMouseManager().getUIManager() != this.uiManager)
            handler.getMouseManager().setUIManager(this.uiManager);
        uiManager.tick();
        worldControls.tick();
        worldEditorPanel.tick();
    }

    public void render(Graphics g) {
        uiManager.render(g);
        worldEditorPanel.render(g);
        worldControls.render(g);
    }

    public UIManager getUiManager() {
        return uiManager;
    }
}
