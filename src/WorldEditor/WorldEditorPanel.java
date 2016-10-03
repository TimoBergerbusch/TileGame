package WorldEditor;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import gfx.Assets;
import tiles.StaticTiles;
import tiles.Tile;
import ui.ClickListener;
import ui.UIEditorTile;
import tilegame.Handler;
import ui.UIImageButton;
import ui.UIManager;
import ui.UITileButton;
import utils.Utils;

public class WorldEditorPanel {

    public static int width, height, spawnX, spawnY;
    public static int EDITOR_TILE_WIDTH = 32, EDITOR_TILE_HEIGHT = 32;
    public static int xOffset = 0, yOffset = 0;

    private Handler handler;
    private UITileButton[][] tiles;
    private UIImageButton spawn;
    private WorldEditor worldEditor;

    public WorldEditorPanel(Handler handler, WorldEditor worldEditor, String path) {
        this.handler = handler;
        this.worldEditor = worldEditor;

        loadWorld(path);
    }

    public void tick() {
        double factor = 0.1;
        if (handler.getKeyManager().left)
            xOffset -= EDITOR_TILE_WIDTH * factor;
        if (handler.getKeyManager().right)
            xOffset += EDITOR_TILE_WIDTH * factor;
        if (handler.getKeyManager().up)
            yOffset -= EDITOR_TILE_HEIGHT * factor;
        if (handler.getKeyManager().down)
            yOffset += EDITOR_TILE_HEIGHT * factor;

        fixOffsets();
    }

    private void fixOffsets() {
        if (xOffset > width * EDITOR_TILE_WIDTH - EDITOR_TILE_WIDTH)
            xOffset = width * EDITOR_TILE_WIDTH - EDITOR_TILE_WIDTH;
        if (xOffset < 0)
            xOffset = 0;
        if (yOffset > (height * EDITOR_TILE_HEIGHT) - EDITOR_TILE_HEIGHT)
            yOffset = height * EDITOR_TILE_HEIGHT - EDITOR_TILE_HEIGHT;
        if (yOffset < 0)
            yOffset = 0;
    }

    public void render(Graphics g) {
    }

    private void loadWorld(String path) {
        String file = Utils.loadFileAsString(path);
        String[] tokens = file.split("\\s+");

        width = Utils.parseInt(tokens[0]);
        height = Utils.parseInt(tokens[1]);
        spawnX = Utils.parseInt(tokens[2]);
        spawnY = Utils.parseInt(tokens[3]);

        tiles = new UITileButton[width][height];
        for (int y = 0; y < height; y++)
            for (int x = 0; x < width; x++) {
                tiles[x][y] = new UITileButton(handler, StaticTiles.getNumbersTile(Utils.parseInt(tokens[x + y * width + 4])), x * EDITOR_TILE_WIDTH,
                        y * EDITOR_TILE_HEIGHT, EDITOR_TILE_WIDTH, EDITOR_TILE_HEIGHT);
                worldEditor.getUiManager().addObject(tiles[x][y]);
            }
        spawn = new UIImageButton(spawnX, spawnY, 4, 4, new BufferedImage[]{Assets.spawn, Assets.spawn}, new ClickListener() {
            @Override
            public void onLeftClick() {
                System.out.println("Spawn left click");
            }

            @Override
            public void onRightClick() {
                System.out.println("Spawn right click");
            }
        }, true);
        worldEditor.getUiManager().addObject(spawn);
    }

    public void saveWorld() {
        StringBuilder sb = new StringBuilder();
        sb.append(width).append(" ").append(height).append("\n");
        sb.append((int) spawn.getX()).append(" ").append((int) spawn.getY()).append("\n");
        for (int y = 0; y < tiles[0].length; y++) {
            for (int x = 0; x < tiles.length; x++)
                sb.append(StaticTiles.getTilesNumber(tiles[x][y].getTile())).append(" ");
            sb.append("\n");
        }

        Utils.saveWorld(sb.toString());
    }

    public void loadWorld() {
        String s = Utils.loadWorld();
        for (int y = 0; y < height; y++)
            for (int x = 0; x < width; x++)
                worldEditor.uiManager.removeObject(tiles[x][y]);
        worldEditor.uiManager.removeObject(spawn);
        loadWorld(s);
    }
}
