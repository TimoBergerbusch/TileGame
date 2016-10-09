package WorldEditor;

import java.awt.*;

import WorldEditor.tileChooser.TileChooser;
import tilegame.Handler;
import ui.UIManager;

public class WorldEditor {

    public UIManager uiManager;
    private Handler handler;
    private WorldEditorPanel worldEditorPanel;
    private WorldControls worldControls;
    private TileChooser tileChooser;

    public WorldEditor(Handler handler) {
        this.handler = handler;
        uiManager = new UIManager(handler);
        worldEditorPanel = new WorldEditorPanel(handler, this, "res/worlds/world3.lvl");
        worldControls = new WorldControls(handler, this, worldEditorPanel);
        tileChooser = new TileChooser(handler);
    }

    public void tick() {
        if (handler.getKeyManager().showTileChooser && !tileChooser.getVisible())
            tileChooser.setVisible(true);
        if (handler.getMouseManager().getUIManager() != this.uiManager)
            handler.getMouseManager().setUIManager(this.uiManager);

        worldControls.tick();
        worldEditorPanel.tick();
        uiManager.tick();
    }

    public void render(Graphics g) {
        worldEditorPanel.render(g);
        worldControls.render(g);
        uiManager.render(g);
    }

    public UIManager getUiManager() {
        return uiManager;
    }

    public TileChooser getTileChooser() {
        return tileChooser;
    }
}
