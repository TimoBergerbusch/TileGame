package WorldEditor;

import java.awt.*;

import tiles.StaticTiles;
import ui.UIEditorTile;
import tilegame.Handler;
import ui.UIManager;
import ui.UITileButton;

public class WorldEditorPanel {

    public static int EDITOR_PANEL_WIDTH = 50, EDITOR_PANEL_HEIGHT = 20;
    public static int EDITOR_TILE_WIDTH = 16, EDITOR_TILE_HEIGHT = 16;

    private Handler handler;
    private UIManager uiManager;

    public WorldEditorPanel(Handler handler) {
        this.handler = handler;
        uiManager = new UIManager(handler);
        handler.getMouseManager().setUIManager(uiManager);

//        uiManager.addObject(new UIEditorTile(100, 100, EDITOR_TILE_WIDTH, EDITOR_TILE_HEIGHT));
        for (int y = 0; y < EDITOR_TILE_HEIGHT; y++)
            for (int x = 0; x < EDITOR_PANEL_WIDTH; x++)
                uiManager.addObject(new UITileButton(StaticTiles.grassTile, x * EDITOR_TILE_WIDTH, y * EDITOR_TILE_HEIGHT, EDITOR_TILE_WIDTH, EDITOR_TILE_HEIGHT));
    }

    public void tick() {
        if (handler.getMouseManager().getUIManager() != uiManager)
            handler.getMouseManager().setUIManager(uiManager);
        uiManager.tick();
    }

    public void render(Graphics g) {
        uiManager.render(g);
    }
}
