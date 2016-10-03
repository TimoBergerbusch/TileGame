package WorldEditor;

import java.awt.*;

import tilegame.Handler;
import ui.UIEditorTile;
import ui.UIManager;
import utils.Utils;
import worlds.World;

public class WorldEditor {

    private Handler handler;
    private WorldEditorPanel worldEditorPanel;
    private World world;

    public WorldEditor(Handler handler) {
        worldEditorPanel = new WorldEditorPanel(handler);
    }

    public void tick() {
        worldEditorPanel.tick();
    }

    public void render(Graphics g) {
        worldEditorPanel.render(g);
    }

}
